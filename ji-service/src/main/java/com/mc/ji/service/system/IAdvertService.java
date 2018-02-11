package com.mc.ji.service.system;

import com.mc.ji.common.base.IBaseService;
import com.mc.ji.model.system.AdvertDO;

import java.util.List;

/**
 * 广告的服务接口
 * @author mc
 * @date 2017-11-8
 */
public interface IAdvertService extends IBaseService<AdvertDO> {

    /**
     * 后台-根据条件获取广告列表，并分页显示
     * add by mc 2017-9-3
     * @param advertDO
     * @return
     * @throws Exception
     */
    List<AdvertDO> getAdvertDOList(AdvertDO advertDO) throws Exception;

    /**
     * 前端-根据条件获取广告分页，只显示可看的内容
     * add by mc 2017-11-18
     * @param advertDO
     * @return
     * @throws Exception
     */
    List<AdvertDO> getAdvertPage(AdvertDO advertDO) throws Exception;
}
