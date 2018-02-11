package com.mc.ji.service.account;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.model.account.AccountTypeDO;

import java.util.List;

/**
 * 账目类型的服务接口
 * @author mc
 * @date 2017-8-17
 */
public interface IAccountTypeService extends IBaseService<AccountTypeDO> {

    /**
     * 根据条件获取账目类型列表，并分页显示
     * add by mc 2017-9-4
     * @param accountTypeDO
     * @return
     * @throws Exception
     */
    List<AccountTypeDO> getAccountTypeDOList(AccountTypeDO accountTypeDO) throws Exception;

    /**
     * 前端-查询所有账目类型，包括系统默认和自己创建的
     * add by mc 2017-11-18
     * @param accountTypeDO
     * @return
     * @throws Exception
     */
    List<AccountTypeDO> getAccountTypeAllList(AccountTypeDO accountTypeDO) throws Exception;
}
