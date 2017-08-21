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
     * 获取账目列表，分页显示
     * add by mc 2017-8-17
     * @param page 页码
     * @param rows 每页显示行数
     * @return
     */
    List<AccountVO> getAccountVoList(Integer page, Integer rows) throws Exception;

    /**
     * 根据帐目题目，模糊查询账目列表，分页显示
     * add by mc 2017-8-17
     * @param title 账目题目
     * @param page
     * @param rows
     * @return
     */
    List<AccountVO> getAccountVoListByTitle(String title, Integer page, Integer rows) throws Exception;
}
