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
     * 根据条件获取系统用户列表，并分页显示
     * add by mc 2017-8-15
     * modify by mc 2017-8-27
     * @param pageIndex 页码
     * @param pageSize 每页显示行数
     * @param name 账号或用户名
     * @param phone 手机号
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     * @throws Exception
     */
    List<SysUserVO> getSysUserVoList(Integer pageIndex, Integer pageSize, String name, String phone, String createTimeBegin, String createTimeEnd, String sort, String order) throws Exception;

    /**
     * 根据帐号或名字，模糊查询系统用户列表，分页显示
     * add by mc 2017-8-15
     * @param name 帐号或用户名
     * @param page
     * @param rows
     * @return
     */
    List<SysUserVO> getSysUserVoListByName(String name, Integer page, Integer rows) throws Exception;

}
