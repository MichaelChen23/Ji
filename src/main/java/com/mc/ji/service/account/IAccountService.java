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
     * @param accountVO
     * @return
     * @throws Exception
     */
    List<AccountVO> getAccountVOList(AccountVO accountVO) throws Exception;

}
