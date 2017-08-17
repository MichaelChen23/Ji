package com.mc.ji.common.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 文档显示类
 * @author mc
 * @date 2017-8-17
 */
public class FileVO implements Serializable {

    private String id;//文档Id

    private String title;//文档题目

    private String status;//文档状态

    private String createAccount;//创建人的帐号

    private Date createTime;//创建时间

    private String updateAccount;//更新人的帐号

    private Date updateTime;//更新时间

    private String content;//文档内容

    private String folderId;//文档所在文件夹Id

    private String folderName;//文档所在文件夹名

    private String folderPid;//父文件夹Id

    private String folderPath;//文件夹全路径

    private String folderLevel;//文件夹层级

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
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

    public String getFolderLevel() {
        return folderLevel;
    }

    public void setFolderLevel(String folderLevel) {
        this.folderLevel = folderLevel;
    }
}
