package com.mc.ji.controller.system;

import com.github.pagehelper.PageInfo;
import com.mc.ji.common.base.BaseController;
import com.mc.ji.model.system.RoleDO;
import com.mc.ji.service.system.IRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色的Controller
 * @author mc
 * @date 2017-8-11
 */
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController<IRoleService, RoleDO> {

    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);

    @RequestMapping(value = "/getRoleList", method = RequestMethod.POST)
    public PageInfo<RoleDO> getRoleList(@RequestBody RoleDO roleDO) {
        try {
            List<RoleDO> list = getServiceImpl().getRoleDOList(roleDO);
            return new PageInfo<RoleDO>(list);
        } catch (Exception e) {
            logger.error("get role list fail(获取用户角色列表失败) -- :{}", e.getMessage());
            return null;
        }
    }
}
