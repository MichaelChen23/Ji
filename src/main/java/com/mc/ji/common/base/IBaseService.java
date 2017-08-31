package com.mc.ji.common.base;

import java.util.List;

/**
 * 基础服务接口
 * @author mc
 * @date 2017-8-8
 */
public interface IBaseService<T extends BaseDO> {

    Boolean saveByObj(T DO);

    Boolean removeByObj(T DO);

    Boolean updateByObj(T DO);

    T getOneByObj(T DO);

    List<T> getListByObj(T DO);

    List<T> getALL();

    Integer getCount(T DO);

    List<T> searchListByKV(T DO);
}
