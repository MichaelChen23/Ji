package com.mc.ji.common.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 账目显示类
 * @author mc
 * @date 2017-8-17
 */
public class AccountVO extends BaseVO implements Serializable {

    private String id;//账目Id

    private String title;//账目题目

    private String action;//账目进出，earn-收入, pay-支出

    private BigDecimal amount;//账目金额

    private String accountTypeId;//账目类型Id

    private String accountTypeName;//账目类型

    private String status;//账目状态

    private String createAccount;//创建人的帐号

    private String createTime;//创建时间

    private String updateAccount;//更新人的帐号

    private String updateTime;//更新时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(String accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateAccount() {
        return createAccount;
    }

    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AccountVO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", action='" + action + '\'' +
                ", amount=" + amount +
                ", accountTypeId='" + accountTypeId + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", status='" + status + '\'' +
                ", createAccount='" + createAccount + '\'' +
                ", createTime=" + createTime +
                ", updateAccount='" + updateAccount + '\'' +
                ", updateTime=" + updateTime +
                super.toString() + '}';
    }
}
