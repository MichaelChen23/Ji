package com.mc.ji.controller.user;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.model.user.UserDO;
import com.mc.ji.service.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户的Controller
 * @author mc
 * @date 2017-11-7
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<IUserService, UserDO> {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    public PageInfo<UserDO> getUserList(@RequestBody UserDO DO) {
        try {
            if (DO == null) return null;
            List<UserDO> list = getServiceImpl().getUserDOList(DO);
            return new PageInfo<UserDO>(list);
        } catch (Exception e) {
            logger.error("get user list fail(获取用户列表失败) -- :{}", e.getMessage());
            return null;
        }
    }
}
