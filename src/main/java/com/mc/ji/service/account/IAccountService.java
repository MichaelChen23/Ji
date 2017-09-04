package com.mc.ji.service.account;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.common.vo.AccountVO;
import com.mc.ji.model.account.AccountDO;

import java.util.List;

/**
 * 账目的服务接口
 * @author mc
 * @date 2017-8-17
 */
public interface IAccountService extends IBaseService<AccountDO> {

    /**
     * 根据条件获取账目VO列表,关联查询，并分页显示
     * add by mc 2017-8-17
     * modify by mc 2017-9-3
     * @param VO
     * @return
     * @throws Exception
     */
    List<AccountVO> getAccountVOList(AccountVO VO) throws Exception;

    /**
     * 根据帐目题目，模糊查询账目列表，分页显示
     * add by mc 2017-8-17
     * @param title 账目题目
     * @param page
     * @param rows
     * @return
     */
    List<AccountVO> getAccountVOListByTitle(String title, Integer page, Integer rows) throws Exception;
}
