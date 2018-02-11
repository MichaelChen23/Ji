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

    /**
     * 根据条件查询角色列表
     * modify by mc 2017-9-4
     * @param name 角色名
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     */
    List<RoleDO> getRoleDOList(@Param("name")String name, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);
}