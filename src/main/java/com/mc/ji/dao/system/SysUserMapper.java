package com.mc.ji.dao.system;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.common.vo.SysUserVO;
import com.mc.ji.model.system.SysUserDO;

import java.util.List;

/**
 * 系统用户的数据访问层Mapper
 * @author mc
 * @date 2017-8-8
 */
public interface SysUserMapper extends JiMapper<SysUserDO> {

    List<SysUserVO> getSysUserVoList();

    List<SysUserVO> getSysUserVoListByName(String name);
}