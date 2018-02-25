package com.mc.ji.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.utils.StringUtil;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.dao.system.RoleMapper;
import com.mc.ji.model.system.RoleDO;
import com.mc.ji.service.system.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色的服务接口实现
 * @author mc
 * @date 2017-8-11
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, RoleDO> implements IRoleService {

    @Override
    public List<RoleDO> getRoleDOList(RoleDO DO) throws Exception {
        if (DO.getPageIndex() == 0 && DO.getPageSize() > 0) {
            PageHelper.startPage(DO.getPageIndex(), DO.getPageSize());
        } else if (DO.getPageIndex() > 0 && DO.getPageSize() > 0) {
            PageHelper.offsetPage(DO.getPageIndex(), DO.getPageSize());
        }
        return getMapper().getRoleDOList(DO.getName(), DO.getCreateTimeBegin(), DO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("", DO.getSort()), DO.getOrder());
    }
}
