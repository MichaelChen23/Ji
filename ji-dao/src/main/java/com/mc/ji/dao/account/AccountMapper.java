package com.mc.ji.dao.account;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.common.vo.AccountVO;
import com.mc.ji.common.vo.BaseCountAccountVO;
import com.mc.ji.model.account.AccountDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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
     * @param accountTypeId 账目类型Id
     * @param createAccount 创建帐号
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     */
    List<AccountVO> getAccountVOList(@Param("title")String title, @Param("action")String action, @Param("accountTypeId")String accountTypeId, @Param("createAccount")String createAccount, @Param("createTimeBegin")String createTimeBegin, @Param("createTimeEnd")String createTimeEnd, @Param("sortName")String sort, @Param("sortOrder")String order);

    /**
     * 根据创建人、支出收入、账目类型对账单做统计
     * add by mc 2017-11-25
     * @param accountVO
     * @return
     */
    List<BaseCountAccountVO> countAccountByActionType(AccountVO accountVO);

    /**
     * 查询出某用户账目上的最大日期和最小日期
     * add by mc 2017-11-27
     * @param createAccount
     * @return
     */
    Map getCountDateMaxAndMin(@Param("createAccount")String createAccount);
}