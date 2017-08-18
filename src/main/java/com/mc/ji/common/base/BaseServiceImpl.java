package com.mc.ji.common.base;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 基础服务接口实现
 * @author mc
 * @date 2017-8-8
 */
public class BaseServiceImpl<M extends JiMapper<T>, T extends BaseDO> implements IBaseService<T> {

    @Autowired
    private M mapper;

    public M getMapper() {
        return mapper;
    }

    @Override
    public Boolean saveByObj(T DO) {
        return mapper.insertSelective(DO) != 0;
    }

    @Override
    public Boolean removeByObj(T DO) {
        return mapper.delete(DO) != 0;
    }

    @Override
    public Boolean updateByObj(T DO) {
        return mapper.updateByPrimaryKey(DO) != 0;
    }

    @Override
    public T getOneByObj(T DO) {
        return mapper.selectOne(DO);
    }

    @Override
    public List<T> getListByObj(T DO) {
        if (DO.getPage() != null && DO.getRows() != null) {
            PageHelper.startPage(DO.getPage(), DO.getRows());
        }
        return mapper.selectAll();
    }

    @Override
    public Integer getCount(T DO) {
        return mapper.selectCount(DO);
    }

    @Override
    public List<T> searchListByKV(T DO) {
        if (DO.getPage() != null && DO.getRows() != null) {
            PageHelper.startPage(DO.getPage(), DO.getRows());
        }
        Example example = new Example(DO.getClass());
        example.createCriteria().andLike(""+DO.getSearchKey(),"%"+DO.getSearchValue()+"%");
        return mapper.selectByExample(example);
    }

}
