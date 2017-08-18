package com.mc.ji.service.account.impl;

import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.dao.account.AccountTypeMapper;
import com.mc.ji.model.account.AccountTypeDO;
import com.mc.ji.service.account.IAccountTypeService;
import org.springframework.stereotype.Service;

/**
 * 账目类型的服务接口实现
 * @author mc
 * @date 2017-8-17
 */
@Service
public class AccountTypeServiceImpl extends BaseServiceImpl<AccountTypeMapper, AccountTypeDO> implements IAccountTypeService {
}
