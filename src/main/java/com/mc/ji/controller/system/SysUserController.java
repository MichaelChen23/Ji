package com.mc.ji.controller.system;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.common.base.BaseDO;
import com.mc.ji.common.vo.SysUserVO;
import com.mc.ji.model.system.SysUserDO;
import com.mc.ji.service.system.ISysUserService;
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

    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    public PageInfo<SysUserVO> getSysUserList(@RequestBody BaseDO DO) {
        try {
            List<SysUserVO> list = getServiceImpl().getSysUserVoList(DO.getPage(), DO.getRows());
            return new PageInfo<SysUserVO>(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/searchUserListByName", method = RequestMethod.POST)
    public PageInfo<SysUserVO> searchSysUserList(@RequestBody BaseDO DO) {
        try {
            List<SysUserVO> list = getServiceImpl().getSysUserVoListByName(DO.getSearchValue(), DO.getPage(), DO.getRows());
            return new PageInfo<SysUserVO>(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
