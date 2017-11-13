package com.mc.ji.dao.user;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.model.user.UserDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户的数据访问层Mapper
 * @author mc
 * @date 2017-11-7
 */
public interface UserMapper extends JiMapper<UserDO> {
    /**
     * 根据条件查询用户列表
     * add by mc 2017-11-7
     * @param id 用户ID
     * @param nikeName 用户名
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     */
    List<UserDO> getUserDOList(@Param("id")String id, @Param("nikeName")String nikeName, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);
}