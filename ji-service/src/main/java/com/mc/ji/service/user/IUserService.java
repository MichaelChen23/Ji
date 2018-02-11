package com.mc.ji.service.user;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.model.user.UserDO;

import java.util.List;

/**
 * 用户的服务接口
 * @author mc
 * @date 2017-11-7
 */
public interface IUserService extends IBaseService<UserDO> {

    /**
     * 根据条件获取用户列表，并分页显示
     * add by mc 2017-11-7
     * @param DO
     * @return
     * @throws Exception
     */
    List<UserDO> getUserDOList(UserDO DO) throws Exception;
}
