package com.mc.ji.controller.system;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.model.system.UserAdviseDO;
import com.mc.ji.service.system.IUserAdviseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户建议的Controller
 * @author mc
 * @date 2017-11-23
 */
@RestController
@RequestMapping("/user-advise")
public class UserAdviseController  extends BaseController<IUserAdviseService, UserAdviseDO> {

    private static final Logger logger = LoggerFactory.getLogger(UserAdviseController.class);

    @RequestMapping(value = "/getUserAdviseList", method = RequestMethod.POST)
    public PageInfo<UserAdviseDO> getUserAdviseList(@RequestBody UserAdviseDO userAdviseDO) {
        try {
            List<UserAdviseDO> list = getServiceImpl().getUserAdviseDOList(userAdviseDO);
            return new PageInfo<UserAdviseDO>(list);
        } catch (Exception e) {
            logger.error("get user-advise list fail(获取用户建议列表失败) -- :{}", e.getMessage());
            return null;
        }
    }
}
