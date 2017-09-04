package com.mc.ji.dao.account;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.model.account.AccountTypeDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 账目类型的数据访问层Mapper
 * @author mc
 * @date 2017-8-17
 */
public interface AccountTypeMapper extends JiMapper<AccountTypeDO> {

    /**
     * 根据条件查询账目类型列表
     * add by mc 2017-9-4
     * @param name 账目类型名
     * @param createAccount 创建帐号
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     */
    List<AccountTypeDO> getAccountTypeDOList(@Param("name")String name, @Param("createAccount")String createAccount, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);
}