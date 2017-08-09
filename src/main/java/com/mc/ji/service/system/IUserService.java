package com.mc.ji.service.system;

import com.mc.ji.model.UserDO;

/**
 * 系统使用者的服务接口
 * @author mc
 * @date 2017-8-8
 */
public interface IUserService {

    UserDO getById(Integer id);
}
