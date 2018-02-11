package com.mc.ji.service.system;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.model.system.UserAdviseDO;

import java.util.List;

/**
 * 用户建议的服务接口
 * @author mc
 * @date 2017-11-23
 */
public interface IUserAdviseService extends IBaseService<UserAdviseDO> {

    /**
     * 根据条件获取用户建议列表，并分页显示
     * add by mc 2017-11-23
     * @param userAdviseDO
     * @return
     * @throws Exception
     */
    List<UserAdviseDO> getUserAdviseDOList(UserAdviseDO userAdviseDO) throws Exception;
}
