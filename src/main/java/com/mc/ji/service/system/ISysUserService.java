package com.mc.ji.service.system;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.common.vo.SysUserVO;
import com.mc.ji.model.system.SysUserDO;

import java.util.List;

/**
 * 系统用户的服务接口
 * @author mc
 * @date 2017-8-8
 */
public interface ISysUserService extends IBaseService<SysUserDO> {

    /**
     * 获取系统用户列表，分页显示
     * add by mc 2017-8-15
     * @param page 页码
     * @param rows 每页显示行数
     * @return
     */
    List<SysUserVO> getSysUserVoList(Integer page, Integer rows);

    /**
     * 根据帐号或名字，模糊查询系统用户列表，分页显示
     * add by mc 2017-8-15
     * @param name 帐号或用户名
     * @param page
     * @param rows
     * @return
     */
    List<SysUserVO> getSysUserVoListByName(String name, Integer page, Integer rows);

}
