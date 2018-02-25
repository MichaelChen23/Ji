package com.mc.ji.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.common.utils.StringUtil;
import com.mc.ji.dao.user.UserMapper;
import com.mc.ji.model.user.UserDO;
import com.mc.ji.service.user.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户的服务接口实现
 * @author mc
 * @date 2017-11-7
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, UserDO> implements IUserService {

    @Override
    public List<UserDO> getUserDOList(UserDO DO) throws Exception {
        if (DO.getPageIndex() == 0 && DO.getPageSize() > 0) {
            PageHelper.startPage(DO.getPageIndex(), DO.getPageSize());
        } else if (DO.getPageIndex() > 0 && DO.getPageSize() > 0) {
            PageHelper.offsetPage(DO.getPageIndex(), DO.getPageSize());
        }
        return getMapper().getUserDOList(DO.getId(), DO.getNickName(), DO.getCreateTimeBegin(), DO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("", DO.getSort()), DO.getOrder());
    }
}
