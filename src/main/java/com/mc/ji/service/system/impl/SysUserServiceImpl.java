package com.mc.ji.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.StringUtil;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.common.vo.SysUserVO;
import com.mc.ji.dao.system.SysUserMapper;
import com.mc.ji.model.system.SysUserDO;
import com.mc.ji.service.system.ISysUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统用户的服务接口实现
 * @author mc
 * @date 2017-8-8
 */
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUserMapper, SysUserDO> implements ISysUserService {

    @Override
    public List<SysUserDO> getSysUserDOList(SysUserDO DO) throws Exception {
        if (DO.getPageIndex() == 0 && DO.getPageSize() > 0) {
            PageHelper.startPage(DO.getPageIndex(), DO.getPageSize());
        } else if (DO.getPageIndex() > 0 && DO.getPageSize() > 0) {
            PageHelper.offsetPage(DO.getPageIndex(), DO.getPageSize());
        }
        return getMapper().getSysUserDOList(DO.getName(), DO.getPhone(), DO.getCreateTimeBegin(), DO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("", DO.getSort()), DO.getOrder());
    }

    @Override
    public List<SysUserVO> getSysUserVoListByName(String name, Integer page, Integer rows) throws Exception {
        if (page > 0 && rows > 0) {
            PageHelper.startPage(page, rows);
        }
        return getMapper().getSysUserVoListByName(name);
    }

}
