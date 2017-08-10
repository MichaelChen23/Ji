package com.mc.ji.common;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 基础服务接口实现
 * @author mc
 * @date 2017-8-8
 */
public class BaseServiceImpl<T extends JiMapper> implements IBaseService {

    @Autowired
    private T mapper;

    @Override
    public Boolean saveByObj(BaseDO DO) {
        return mapper.insert(DO) != 0;
    }

    @Override
    public Boolean removeByObj(BaseDO DO) {
        return mapper.delete(DO) != 0;
    }

    @Override
    public Boolean updateByObj(BaseDO DO) {
        return mapper.updateByPrimaryKey(DO) != 0;
    }

    @Override
    public BaseDO getOneByObj(BaseDO DO) {
        return (BaseDO) mapper.selectOne(DO);
    }

    @Override
    public List getListByObj(BaseDO DO) {
        if (DO.getPage() != null && DO.getRows() != null) {
            PageHelper.startPage(DO.getPage(), DO.getRows());
        }
        return mapper.selectAll();
    }

    @Override
    public Integer getCount(BaseDO DO) {
        return mapper.selectCount(DO);
    }
}
