package com.mc.ji.service.account.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.StringUtil;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.common.vo.AccountVO;
import com.mc.ji.common.vo.BaseCountAccountVO;
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
    public List<AccountVO> getAccountVOList(AccountVO accountVO) throws Exception {
        if (accountVO.getPageIndex() == 0 && accountVO.getPageSize() > 0) {
            PageHelper.startPage(accountVO.getPageIndex(), accountVO.getPageSize());
        } else if (accountVO.getPageIndex() > 0 && accountVO.getPageSize() > 0) {
            PageHelper.offsetPage(accountVO.getPageIndex(), accountVO.getPageSize());
        }
        return getMapper().getAccountVOList(accountVO.getTitle(), accountVO.getAction(), accountVO.getAccountTypeId(), accountVO.getCreateAccount(), accountVO.getCreateTimeBegin(), accountVO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("a", accountVO.getSort()), accountVO.getOrder());
    }

    @Override
    public List<BaseCountAccountVO> countAccountByActionType(AccountVO accountVO) throws Exception {
        return getMapper().countAccountByActionType(accountVO);
    }

}
