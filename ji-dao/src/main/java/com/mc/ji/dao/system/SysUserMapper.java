package com.mc.ji.dao.system;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.model.system.SysUserDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统用户的数据访问层Mapper
 * @author mc
 * @date 2017-8-8
 */
public interface SysUserMapper extends JiMapper<SysUserDO> {

    /**
     * 根据条件查询系统用户
     * modify by mc 2017-9-4
     * @param name 账号或用户名
     * @param phone 手机号
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     */
    List<SysUserDO> getSysUserDOList(@Param("name")String name, @Param("phone")String phone, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);
}