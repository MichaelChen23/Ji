package com.mc.ji.controller.system;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.Constant;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.base.BaseResponse;
import com.mc.ji.model.system.SysUserDO;
import com.mc.ji.service.system.ISysUserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * 系统用户的Controller
 * @author mc
 * @date 2017-8-8
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController extends BaseController<ISysUserService, SysUserDO> {

    private static final Logger logger = LoggerFactory.getLogger(SysUserController.class);

    /**
     * 后台管理员登录接口
     * add by mc 2017-8-20
     * @param sysUserDO
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<SysUserDO> doAdminLogin(@RequestBody SysUserDO sysUserDO) {
        try {
            String userName = sysUserDO.getUsername();
            String password = sysUserDO.getPassword();
            SysUserDO userDO = null;
            if (StringUtils.isNotBlank(userName) && StringUtils.isNotBlank(password)) {
                userDO = getServiceImpl().getOneByObj(sysUserDO);
            }
            if (userDO != null && Constant.STATUS_UNLOCK.equals(userDO.getStatus())) {
                userDO.setLastLoginTime(new Date());
                update(userDO);//更新最新登录时间
                return new BaseResponse<SysUserDO>(userDO);
            } else {
                return new BaseResponse<SysUserDO>(null);
            }
        } catch (Exception e) {
            logger.error("sys-user login fail(系统用户登录失败)——"+sysUserDO.toString()+":{}", e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/getSysUserList", method = RequestMethod.POST)
    public PageInfo<SysUserDO> getSysUserList(@RequestBody SysUserDO DO) {
        try {
            if (DO == null) return null;
            List<SysUserDO> list = getServiceImpl().getSysUserDOList(DO);
            return new PageInfo<SysUserDO>(list);
        } catch (Exception e) {
            logger.error("get sys-user list fail(获取系统用户列表失败) -- :{}", e.getMessage());
            return null;
        }
    }

}
