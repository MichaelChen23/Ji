package com.mc.ji.service.system.impl;

import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.dao.system.RoleMapper;
import com.mc.ji.model.system.RoleDO;
import com.mc.ji.service.system.IRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色的服务接口实现
 * @author mc
 * @date 2017-8-11
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, RoleDO> implements IRoleService {
}
