package com.mc.ji.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.StringUtil;
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
    public List<RoleDO> getRoleDOList(Integer pageIndex, Integer pageSize, String name, String createTimeBegin, String createTimeEnd, String sort, String order) throws Exception {
        if (pageIndex == 0 && pageSize > 0) {
            PageHelper.startPage(pageIndex, pageSize);
        } else if (pageIndex > 0 && pageSize > 0) {
            PageHelper.offsetPage(pageIndex, pageSize);
        }
        return getMapper().getRoleDOList(name, createTimeBegin, createTimeEnd, StringUtil.changeDBfieldPattern("", sort), order);
    }
}
