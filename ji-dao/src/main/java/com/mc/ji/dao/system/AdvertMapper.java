package com.mc.ji.dao.system;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.model.system.AdvertDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 广告的数据访问层Mapper
 * @author mc
 * @date 2017-11-8
 */
public interface AdvertMapper extends JiMapper<AdvertDO> {

    /**
     * 根据条件查询广告列表
     * modify by mc 2017-11-8
     * @param title 角色名
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     */
    List<AdvertDO> getAdvertDOList(@Param("title")String title, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);

}