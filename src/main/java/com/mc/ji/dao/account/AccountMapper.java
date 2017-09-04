package com.mc.ji.dao.account;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.common.vo.AccountVO;
import com.mc.ji.model.account.AccountDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 账目的数据访问层Mapper
 * @author mc
 * @date 2017-8-17
 */
public interface AccountMapper extends JiMapper<AccountDO> {

    /**
     * 条件查询账目列表
     * modify by mc 2017-9-4
     * @param title 账目标题
     * @param action 账目方式
     * @param createAccount 创建帐号
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     */
    List<AccountVO> getAccountVOList(@Param("title")String title, @Param("action")String action, @Param("createAccount")String createAccount, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);

    List<AccountVO> getAccountVOListByTitle(String title);
}