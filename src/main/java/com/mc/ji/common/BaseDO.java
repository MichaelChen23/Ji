package com.mc.ji.common;

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
}
