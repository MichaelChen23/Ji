package com.mc.ji.dao.system;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.common.vo.SysUserVO;
import com.mc.ji.model.system.SysUserDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统用户的数据访问层Mapper
 * @author mc
 * @date 2017-8-8
 */
public interface SysUserMapper extends JiMapper<SysUserDO> {

    List<SysUserDO> getSysUserDOList(@Param("name")String name, @Param("phone")String phone, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);

    List<SysUserVO> getSysUserVoListByName(String name);
}