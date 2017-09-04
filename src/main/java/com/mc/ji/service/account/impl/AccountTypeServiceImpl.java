package com.mc.ji.service.account.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.StringUtil;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.dao.account.AccountTypeMapper;
import com.mc.ji.model.account.AccountTypeDO;
import com.mc.ji.service.account.IAccountTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账目类型的服务接口实现
 * @author mc
 * @date 2017-8-17
 */
@Service
public class AccountTypeServiceImpl extends BaseServiceImpl<AccountTypeMapper, AccountTypeDO> implements IAccountTypeService {

    @Override
    public List<AccountTypeDO> getAccountTypeDOList(AccountTypeDO DO) throws Exception {
        if (DO.getPageIndex() == 0 && DO.getPageSize() > 0) {
            PageHelper.startPage(DO.getPageIndex(), DO.getPageSize());
        } else if (DO.getPageIndex() > 0 && DO.getPageSize() > 0) {
            PageHelper.offsetPage(DO.getPageIndex(), DO.getPageSize());
        }
        return getMapper().getAccountTypeDOList(DO.getName(), DO.getCreateAccount(), DO.getCreateTimeBegin(), DO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("", DO.getSort()), DO.getOrder());
    }
}
