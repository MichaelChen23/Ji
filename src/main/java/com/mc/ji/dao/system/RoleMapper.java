package com.mc.ji.dao.system;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.model.system.RoleDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色的数据访问层Mapper
 * @author mc
 * @date 2017-8-11
 */
public interface RoleMapper extends JiMapper<RoleDO> {

    List<RoleDO> getRoleDOList(@Param("name")String name, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);
}