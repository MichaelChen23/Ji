package com.mc.ji.model.system;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mc.ji.common.CustomJsonDatetimeDeserializer;
import com.mc.ji.common.base.BaseDO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户的实体类
 * @author mc
 * @date 2017-8-8
 */
@Table(name = "ji_sys_user")
public class SysUserDO extends BaseDO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String username;

    private String password;

    private String name;

    private String phone;

    private String email;

    @Column(name = "role_id")
    private String roleId;

    private String status;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return role_id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
     * @return last_login_time
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
//    @JsonDeserialize(using = CustomJsonDatetimeDeserializer.class)
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysUserDO{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", roleId='" + roleId + '\'' +
                ", status='" + status + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", createAccount='" + createAccount + '\'' +
                ", createTime=" + createTime +
                ", updateAccount='" + updateAccount + '\'' +
                ", updateTime=" + updateTime +
                super.toString() + '}';
    }
}