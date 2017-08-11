package com.mc.ji.common.base;

import com.mc.ji.common.Constant;

import javax.persistence.Transient;

/**
 * 基础实体信息
 * @author MC
 * @date 2017-8-8
 */
public class BaseDO {

    @Transient
    private Integer page = Constant.DEFAULT_CURRENT_PAGE;

    @Transient
    private Integer rows = Constant.DEFAULT_ROWS;

    //searchKey-查询的字段
    @Transient
    private String searchKey;

    //searchValue-查询字段的值
    @Transient
    private String searchValue;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
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
}
