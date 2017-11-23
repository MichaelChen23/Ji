package com.mc.ji.model.system;

import com.mc.ji.common.base.BaseDO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户建议的实体类
 * @author mc
 * @date 2017-11-23
 */
@Table(name = "ji_user_advise")
public class UserAdviseDO extends BaseDO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private Integer score;

    private String advise;

    private String status;

    private String remark;

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
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return advise
     */
    public String getAdvise() {
        return advise;
    }

    /**
     * @param advise
     */
    public void setAdvise(String advise) {
        this.advise = advise;
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
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
}