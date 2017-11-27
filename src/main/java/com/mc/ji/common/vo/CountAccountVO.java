package com.mc.ji.common.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 总账目统计 显示类
 * @author mc
 * @date 2017-11-25
 */
public class CountAccountVO implements Serializable {

    List<BaseCountAccountVO> earnList;

    BigDecimal totalEarnAmount;

    Integer totalEarnCount;

    List<BaseCountAccountVO> payList;

    BigDecimal totalPayAmount;

    Integer totalPayCount;

    BigDecimal totalAmount;

    Integer totalCount;

    String countBeginDate;

    String countEndDate;

    public List<BaseCountAccountVO> getEarnList() {
        return earnList;
    }

    public void setEarnList(List<BaseCountAccountVO> earnList) {
        this.earnList = earnList;
    }

    public BigDecimal getTotalEarnAmount() {
        return totalEarnAmount;
    }

    public void setTotalEarnAmount(BigDecimal totalEarnAmount) {
        this.totalEarnAmount = totalEarnAmount;
    }

    public Integer getTotalEarnCount() {
        return totalEarnCount;
    }

    public void setTotalEarnCount(Integer totalEarnCount) {
        this.totalEarnCount = totalEarnCount;
    }

    public List<BaseCountAccountVO> getPayList() {
        return payList;
    }

    public void setPayList(List<BaseCountAccountVO> payList) {
        this.payList = payList;
    }

    public BigDecimal getTotalPayAmount() {
        return totalPayAmount;
    }

    public void setTotalPayAmount(BigDecimal totalPayAmount) {
        this.totalPayAmount = totalPayAmount;
    }

    public Integer getTotalPayCount() {
        return totalPayCount;
    }

    public void setTotalPayCount(Integer totalPayCount) {
        this.totalPayCount = totalPayCount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getCountBeginDate() {
        return countBeginDate;
    }

    public void setCountBeginDate(String countBeginDate) {
        this.countBeginDate = countBeginDate;
    }

    public String getCountEndDate() {
        return countEndDate;
    }

    public void setCountEndDate(String countEndDate) {
        this.countEndDate = countEndDate;
    }
}
