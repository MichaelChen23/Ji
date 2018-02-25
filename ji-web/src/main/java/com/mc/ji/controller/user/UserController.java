package com.mc.ji.controller.user;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.Constant;
import com.mc.ji.common.utils.StringUtil;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.base.BaseResponse;
import com.mc.ji.common.utils.HttpUtil;
import com.mc.ji.model.user.UserDO;
import com.mc.ji.service.user.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.Date;
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
    public PageInfo<UserDO> getUserList(@RequestBody UserDO userDO) {
        try {
            if (userDO == null) {
                return null;
            }
            List<UserDO> list = getServiceImpl().getUserDOList(userDO);
            return new PageInfo<UserDO>(list);
        } catch (Exception e) {
            logger.error("get user list fail(获取用户列表失败) -- :{}", e.getMessage());
            return null;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/login/{code}", method = RequestMethod.GET)
    public BaseResponse<UserDO> loginUser(@PathVariable("code") @NotNull String code) {
        StringBuilder sb = new StringBuilder(Constant.WEI_XIN_API + "?");
        sb.append("appid=" + Constant.WEI_XIN_APP_ID + "&");
        sb.append("secret=" + Constant.WEI_XIN_APP_SECRET + "&");
        sb.append("js_code=" + code + "&");
        sb.append("grant_type=" + Constant.WEI_XIN_AUTH_TYPE);
        UserDO userDO = null;
        try {
            String resultStr = HttpUtil.httpGetByJson(sb.toString());
            if (StringUtils.isNotBlank(resultStr)) {
                JSONObject resultObj = new JSONObject(resultStr);
                String openId = resultObj.getString("openid");
                if (StringUtils.isNotBlank(openId)) {
                    userDO = new UserDO();
                    userDO.setId(openId);
                    userDO.setCreateTime(new Date());
                    //首次登录，要注册录入数据库
                    getServiceImpl().saveByObj(userDO);
                }
            }
        } catch (Exception e) {
            logger.error("login user fail(用户登录失败) -- :{}", e.getMessage());
        }
        return new BaseResponse<UserDO>(userDO);
    }

    /**
     * 重写更新用户信息方法，因为nikeName需要对表情做处理
     * modify by MC 2017-12-12
     * @param userDO
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public BaseResponse<Boolean> update(@RequestBody UserDO userDO) {
        if (userDO != null && StringUtils.isNotBlank(userDO.getNickName())) {
            userDO.setNickName(StringUtil.encodingEmojiStr(userDO.getNickName()));
        }
        return super.update(userDO);
    }
}
