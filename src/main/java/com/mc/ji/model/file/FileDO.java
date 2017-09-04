package com.mc.ji.model.file;

import com.mc.ji.common.base.BaseDO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 文档的实体类
 * @author mc
 * @date 2017-8-17
 */
@Table(name = "ji_file")
public class FileDO extends BaseDO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;

    /**
     * 默认为我的文件夹id
     */
    @Column(name = "folder_id")
    private String folderId;

    private String status;

    @Column(name = "create_account")
    private String createAccount;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_account")
    private String updateAccount;

    @Column(name = "update_time")
    private Date updateTime;

    private String content;

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
     * 获取默认为我的文件夹id
     *
     * @return folder_id - 默认为我的文件夹id
     */
    public String getFolderId() {
        return folderId;
    }

    /**
     * 设置默认为我的文件夹id
     *
     * @param folderId 默认为我的文件夹id
     */
    public void setFolderId(String folderId) {
        this.folderId = folderId;
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

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "FileDO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", folderId='" + folderId + '\'' +
                ", status='" + status + '\'' +
                ", createAccount='" + createAccount + '\'' +
                ", createTime=" + createTime +
                ", updateAccount='" + updateAccount + '\'' +
                ", updateTime=" + updateTime +
                ", content='" + content + '\'' +
                super.toString() + '}';
    }
}