package com.mc.ji.service.system.impl;

import com.github.pagehelper.PageHelper;
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
    public List<SysUserVO> getSysUserVoList(Integer page, Integer rows) throws Exception {
        if (page > 0 && rows > 0) {
            PageHelper.startPage(page, rows);
        }
        return getMapper().getSysUserVoList();
    }

    @Override
    public List<SysUserVO> getSysUserVoListByName(String name, Integer page, Integer rows) throws Exception {
        if (page > 0 && rows > 0) {
            PageHelper.startPage(page, rows);
        }
        return getMapper().getSysUserVoListByName(name);
    }

}
