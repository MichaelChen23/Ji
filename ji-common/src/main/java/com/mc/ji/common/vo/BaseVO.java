package com.mc.ji.common.vo;

import java.io.Serializable;

/**
 * 基础VO，用于存放共用查询字段
 * add by mc 2017-9-3
 */
public class BaseVO implements Serializable{

    private Integer pageIndex;//页码，第几页

    private Integer pageSize;//页行，每页有几行

    private String sort;//排序查询字段

    private String order;//排序升降

    private String createTimeBegin;//创建开始时间

    private String createTimeEnd;//创建结束时间

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

    @Override
    public String toString() {
        return "BaseVO{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                ", createTimeBegin='" + createTimeBegin + '\'' +
                ", createTimeEnd='" + createTimeEnd + '\'' +
                '}';
    }
}
