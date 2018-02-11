package com.mc.ji.service.system;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.model.system.RoleDO;

import java.util.List;

/**
 * 角色的服务接口
 * @author mc
 * @date 2017-8-11
 */
public interface IRoleService extends IBaseService<RoleDO> {

    /**
     * 根据条件获取角色列表，并分页显示
     * add by mc 2017-9-3
     * @param DO
     * @return
     * @throws Exception
     */
    List<RoleDO> getRoleDOList(RoleDO DO) throws Exception;

}
