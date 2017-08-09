package com.mc.ji.service.system.impl;

import com.mc.ji.dao.UserMapper;
import com.mc.ji.model.UserDO;
import com.mc.ji.service.system.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 系统使用者的服务接口实现
 * @author mc
 * @date 2017-8-8
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDO getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
