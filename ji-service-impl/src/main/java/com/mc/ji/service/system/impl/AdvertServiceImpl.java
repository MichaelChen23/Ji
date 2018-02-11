package com.mc.ji.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.mc.ji.common.StringUtil;
import com.mc.ji.common.base.BaseServiceImpl;
import com.mc.ji.dao.system.AdvertMapper;
import com.mc.ji.model.system.AdvertDO;
import com.mc.ji.service.system.IAdvertService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 角色的服务接口实现
 * @author mc
 * @date 2017-11-8
 */
@Service
public class AdvertServiceImpl extends BaseServiceImpl<AdvertMapper, AdvertDO> implements IAdvertService {

    @Override
    public List<AdvertDO> getAdvertDOList(AdvertDO advertDO) throws Exception {
        if (advertDO.getPageIndex() == 0 && advertDO.getPageSize() > 0) {
            PageHelper.startPage(advertDO.getPageIndex(), advertDO.getPageSize());
        } else if (advertDO.getPageIndex() > 0 && advertDO.getPageSize() > 0) {
            PageHelper.offsetPage(advertDO.getPageIndex(), advertDO.getPageSize());
        }
        return getMapper().getAdvertDOList(advertDO.getTitle(), advertDO.getCreateTimeBegin(), advertDO.getCreateTimeEnd(), StringUtil.changeDBfieldPattern("", advertDO.getSort()), advertDO.getOrder());
    }

    @Override
    public List<AdvertDO> getAdvertPage(AdvertDO advertDO) throws Exception {
        if (advertDO.getPageIndex() == 0 && advertDO.getPageSize() > 0) {
            PageHelper.startPage(advertDO.getPageIndex(), advertDO.getPageSize());
        } else if (advertDO.getPageIndex() > 0 && advertDO.getPageSize() > 0) {
            PageHelper.offsetPage(advertDO.getPageIndex(), advertDO.getPageSize());
        }
        Example example = new Example(AdvertDO.class);
        example.createCriteria().andEqualTo("status", "y");
        return getMapper().selectByExample(example);
    }

}
