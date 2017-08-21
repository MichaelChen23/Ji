package com.mc.ji.service.account.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.common.vo.AccountVO;
import com.mc.ji.dao.account.AccountMapper;
import com.mc.ji.model.account.AccountDO;
import com.mc.ji.service.account.IAccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账目的服务接口实现
 * @author mc
 * @date 2017-8-17
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl<AccountMapper, AccountDO> implements IAccountService {

    @Override
    public List<AccountVO> getAccountVoList(Integer page, Integer rows) throws Exception {
        if (page > 0 && rows > 0) {
            PageHelper.startPage(page, rows);
        }
        return getMapper().getAccountVoList();
    }

    @Override
    public List<AccountVO> getAccountVoListByTitle(String title, Integer page, Integer rows) throws Exception {
        if (page > 0 && rows > 0) {
            PageHelper.startPage(page, rows);
        }
        return getMapper().getAccountVoListByTitle(title);
    }
}
