package com.mc.ji.controller.system;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.base.BaseDO;
import com.mc.ji.common.base.BaseResponse;
import com.mc.ji.common.vo.SysUserVO;
import com.mc.ji.model.system.SysUserDO;
import com.mc.ji.service.system.ISysUserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
            return new BaseResponse<SysUserDO>(userDO);
        } catch (Exception e) {
            logger.error("系统用户登录失败——", e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    public PageInfo<SysUserVO> getSysUserList(Integer pageIndex, Integer pageSize, String nameStr, String phoneStr) {
        try {
            pageIndex = pageIndex != null ? pageIndex : 1;
            List<SysUserVO> list = getServiceImpl().getSysUserVoList(pageIndex, pageSize);
            return new PageInfo<SysUserVO>(list);
        } catch (Exception e) {
            logger.error("获取系统用户列表失败——", e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/searchUserListByName", method = RequestMethod.POST)
    public PageInfo<SysUserVO> searchSysUserList(@RequestBody BaseDO DO) {
        try {
            List<SysUserVO> list = getServiceImpl().getSysUserVoListByName(DO.getSearchValue(), DO.getPage(), DO.getRows());
            return new PageInfo<SysUserVO>(list);
        } catch (Exception e) {
            logger.error("根据名字获取系统用户列表失败——", e.getMessage());
            return null;
        }
    }
}
