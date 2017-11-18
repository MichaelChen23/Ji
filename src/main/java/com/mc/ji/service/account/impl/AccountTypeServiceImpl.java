package com.mc.ji.service.account.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.StringUtil;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.dao.account.AccountTypeMapper;
import com.mc.ji.model.account.AccountTypeDO;
import com.mc.ji.service.account.IAccountTypeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 账目类型的服务接口实现
 * @author mc
 * @date 2017-8-17
 */
@Service
public class AccountTypeServiceImpl extends BaseServiceImpl<AccountTypeMapper, AccountTypeDO> implements IAccountTypeService {

    @Override
    public List<AccountTypeDO> getAccountTypeDOList(AccountTypeDO accountTypeDO) throws Exception {
        if (accountTypeDO.getPageIndex() == 0 && accountTypeDO.getPageSize() > 0) {
            PageHelper.startPage(accountTypeDO.getPageIndex(), accountTypeDO.getPageSize());
        } else if (accountTypeDO.getPageIndex() > 0 && accountTypeDO.getPageSize() > 0) {
            PageHelper.offsetPage(accountTypeDO.getPageIndex(), accountTypeDO.getPageSize());
        }
        return getMapper().getAccountTypeDOList(accountTypeDO.getName(), accountTypeDO.getCreateAccount(), accountTypeDO.getCreateTimeBegin(), accountTypeDO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("", accountTypeDO.getSort()), accountTypeDO.getOrder());
    }

    @Override
    public List<AccountTypeDO> getAccountTypeAllList(AccountTypeDO accountTypeDO) throws Exception {
        Example example = new Example(AccountTypeDO.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("status","y");
        criteria.andEqualTo("createAccount", "sys");
        if (accountTypeDO != null && StringUtils.isNotBlank(accountTypeDO.getCreateAccount())) {
            criteria.orEqualTo("createAccount", accountTypeDO.getCreateAccount());
        }
        return getMapper().selectByExample(example);
    }


}
