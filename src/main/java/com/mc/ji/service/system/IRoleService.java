package com.mc.ji.service.system;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.model.system.RoleDO;

import java.util.List;

/**
 * 角色的服务接口
 * @author mc
 * @date 2017-8-11
 */
public interface IRoleService extends IBaseService<RoleDO> {

    /**
     * 根据条件获取角色列表，并分页显示
     * add by mc 2017-9-3
     * @param pageIndex 页码
     * @param pageSize 每页显示行数
     * @param name 角色名
     * @param createTimeBegin 创建开始时间
     * @param createTimeEnd 创建结束时间
     * @param sort 排序字段
     * @param order 排序升降
     * @return
     * @throws Exception
     */
    List<RoleDO> getRoleDOList(Integer pageIndex, Integer pageSize, String name, String createTimeBegin, String createTimeEnd, String sort, String order) throws Exception;

}
