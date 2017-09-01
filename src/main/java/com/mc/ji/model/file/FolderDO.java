package com.mc.ji.model.file;

import com.mc.ji.common.base.BaseDO;

import javax.persistence.*;
import java.util.Date;

/**
 * 文件夹的实体类
 * @author mc
 * @date 2017-8-17
 */
@Table(name = "ji_folder")
public class FolderDO extends BaseDO {
    /**
     * 文件夹id，每个用户都默认一个父文件-我的文件夹，相当于/根文件夹
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;

    /**
     * 父文件夹id
     */
    private String pid;

    /**
     * 文件夹全路径/隔开文件夹名name
     */
    private String path;

    /**
     * 文件夹层级，首层层级为1，依次递增
     */
    private Integer level;

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
     * 获取文件夹id，每个用户都默认一个父文件-我的文件夹，相当于/根文件夹
     *
     * @return id - 文件夹id，每个用户都默认一个父文件-我的文件夹，相当于/根文件夹
     */
    public String getId() {
        return id;
    }

    /**
     * 设置文件夹id，每个用户都默认一个父文件-我的文件夹，相当于/根文件夹
     *
     * @param id 文件夹id，每个用户都默认一个父文件-我的文件夹，相当于/根文件夹
     */
    public void setId(String id) {
        this.id = id;
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
     * 获取父文件夹id
     *
     * @return pid - 父文件夹id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置父文件夹id
     *
     * @param pid 父文件夹id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取文件夹全路径/隔开文件夹名name
     *
     * @return path - 文件夹全路径/隔开文件夹名name
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置文件夹全路径/隔开文件夹名name
     *
     * @param path 文件夹全路径/隔开文件夹名name
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取文件夹层级，首层层级为1，依次递增
     *
     * @return level - 文件夹层级，首层层级为1，依次递增
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置文件夹层级，首层层级为1，依次递增
     *
     * @param level 文件夹层级，首层层级为1，依次递增
     */
    public void setLevel(Integer level) {
        this.level = level;
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
        return "FolderDO{" +
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
                '}';
    }
}