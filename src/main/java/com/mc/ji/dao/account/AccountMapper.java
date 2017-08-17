package com.mc.ji.dao.account;

import com.mc.ji.common.base.JiMapper;
import com.mc.ji.common.vo.AccountVO;
import com.mc.ji.model.account.AccountDO;

import java.util.List;

/**
 * 账目的数据访问层Mapper
 * @author mc
 * @date 2017-8-17
 */
public interface AccountMapper extends JiMapper<AccountDO> {

    List<AccountVO> getAccountVoList();

    List<AccountVO> getAccountVoListByTitle(String title);
}