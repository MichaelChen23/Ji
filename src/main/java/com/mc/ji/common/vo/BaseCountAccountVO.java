package com.mc.ji.common.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 每一账目类型的统计显示类
 * @author mc
 * @date 2017-11-25
 */
public class BaseCountAccountVO implements Serializable {

    private String action;//账目进出，"1"-收入, "0"-支出

    private String accountTypeName;//账目类型

    private BigDecimal allAmount;//每类的总金额

    private Integer count;//每类的账目笔数

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public BigDecimal getAllAmount() {
        return allAmount;
    }

    public void setAllAmount(BigDecimal allAmount) {
        this.allAmount = allAmount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
