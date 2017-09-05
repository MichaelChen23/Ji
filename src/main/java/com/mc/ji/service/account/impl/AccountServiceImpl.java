package com.mc.ji.service.account.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.StringUtil;
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
    public List<AccountVO> getAccountVOList(AccountVO VO) throws Exception {
        if (VO.getPageIndex() == 0 && VO.getPageSize() > 0) {
            PageHelper.startPage(VO.getPageIndex(), VO.getPageSize());
        } else if (VO.getPageIndex() > 0 && VO.getPageSize() > 0) {
            PageHelper.offsetPage(VO.getPageIndex(), VO.getPageSize());
        }
        return getMapper().getAccountVOList(VO.getTitle(), VO.getAction(), VO.getCreateAccount(), VO.getCreateTimeBegin(), VO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("a", VO.getSort()), VO.getOrder());
    }

}
