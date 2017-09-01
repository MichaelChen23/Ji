package com.mc.ji.model.account;

import com.mc.ji.common.base.BaseDO;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 账目的实体类
 * @author mc
 * @date 2017-8-17
 */
@Table(name = "ji_account")
public class AccountDO extends BaseDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;

    /**
     * earn-收入, pay-支出
     */
    private String action;

    private BigDecimal amount;

    @Column(name = "account_type_id")
    private String accountTypeId;

    private String status;

    @Column(name = "create_account")
    private String createAccount;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_account")
    private String updateAccount;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取earn-收入, pay-支出
     *
     * @return action - earn-收入, pay-支出
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置earn-收入, pay-支出
     *
     * @param action earn-收入, pay-支出
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return account_type_id
     */
    public String getAccountTypeId() {
        return accountTypeId;
    }

    /**
     * @param accountTypeId
     */
    public void setAccountTypeId(String accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return create_account
     */
    public String getCreateAccount() {
        return createAccount;
    }

    /**
     * @param createAccount
     */
    public void setCreateAccount(String createAccount) {
        this.createAccount = createAccount;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_account
     */
    public String getUpdateAccount() {
        return updateAccount;
    }

    /**
     * @param updateAccount
     */
    public void setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AccountDO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", action='" + action + '\'' +
                ", amount=" + amount +
                ", accountTypeId='" + accountTypeId + '\'' +
                ", status='" + status + '\'' +
                ", createAccount='" + createAccount + '\'' +
                ", createTime=" + createTime +
                ", updateAccount='" + updateAccount + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}