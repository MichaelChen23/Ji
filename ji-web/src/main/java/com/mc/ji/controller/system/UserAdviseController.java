package com.mc.ji.controller.system;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.base.BaseResponse;
import com.mc.ji.common.utils.StringUtil;
import com.mc.ji.model.system.UserAdviseDO;
import com.mc.ji.service.system.IUserAdviseService;
import org.apache.commons.lang3.StringUtils;
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

    /**
     * 保存用户意见的时候，需要对有表情的用户nickName来做表情转码处理
     * add by MC 2017-12-12
     * @param userAdviseDO
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public BaseResponse<Boolean> save(@RequestBody UserAdviseDO userAdviseDO) {
        if (userAdviseDO != null && StringUtils.isNotBlank(userAdviseDO.getUpdateAccount())) {
            userAdviseDO.setUpdateAccount(StringUtil.encodingEmojiStr(userAdviseDO.getUpdateAccount()));
        }
        return super.save(userAdviseDO);
    }
}
