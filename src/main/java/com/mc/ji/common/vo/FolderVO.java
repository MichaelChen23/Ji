package com.mc.ji.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 文件夹显示类
 * @author mc
 * @date 2017-9-4
 */
public class FolderVO extends BaseVO implements Serializable {

    private String id;//文件夹Id

    private String name;//文件夹名

    private String pid;//父文件夹id

    private String path;//文件夹路径

    private Integer level;//文件夹层级

    private String status;//文件夹状态

    private String createAccount;//创建人的帐号

    private Date createTime;//创建时间

    private String updateAccount;//更新人的帐号

    private Date updateTime;//更新时间

    private String folderName;//父文件夹名

    private String folderPid;//父文件夹的父文件夹Id

    private String folderPath;//父文件夹路径

    private Integer folderLevel;//父文件夹层级

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateAccount() {
        return updateAccount;
    }

    public void setUpdateAccount(String updateAccount) {
        this.updateAccount = updateAccount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderPid() {
        return folderPid;
    }

    public void setFolderPid(String folderPid) {
        this.folderPid = folderPid;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public Integer getFolderLevel() {
        return folderLevel;
    }

    public void setFolderLevel(Integer folderLevel) {
        this.folderLevel = folderLevel;
    }

    @Override
    public String toString() {
        return "FolderVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", path='" + path + '\'' +
                ", level=" + level +
                ", status='" + status + '\'' +
                ", createAccount='" + createAccount + '\'' +
                ", createTime=" + createTime +
                ", updateAccount='" + updateAccount + '\'' +
                ", updateTime=" + updateTime +
                ", folderName='" + folderName + '\'' +
                ", folderPid='" + folderPid + '\'' +
                ", folderPath='" + folderPath + '\'' +
                ", folderLevel=" + folderLevel +
                super.toString() + '}';
    }
}
