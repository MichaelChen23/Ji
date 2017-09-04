package com.mc.ji.common.base;

import com.mc.ji.common.Constant;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 基础实体信息
 * @author MC
 * @date 2017-8-8
 */
public class BaseDO implements Serializable{

    @Transient
    private Integer pageIndex = Constant.DEFAULT_CURRENT_PAGE;

    @Transient
    private Integer pageSize = Constant.DEFAULT_ROWS;

    @Transient
    private String searchKey;//searchKey-查询的字段

    @Transient
    private String searchValue;//searchValue-查询字段的值

    @Transient
    String createTimeBegin;//创建开始时间

    @Transient
    String createTimeEnd;//创建结束时间

    @Transient
    String sort;//排序的字段

    @Transient
    String order;//排序的升降

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
