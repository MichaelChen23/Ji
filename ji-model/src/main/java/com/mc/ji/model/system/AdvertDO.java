package com.mc.ji.model.system;

import com.mc.ji.common.base.BaseDO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 广告的实体类
 * @author mc
 * @date 2017-11-8
 */
@Table(name = "ji_advert")
public class AdvertDO extends BaseDO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;

    @Column(name = "image_url")
    private String imageUrl;

    private String content;

    private String url;

    /**
     * 广告状态：y-启用；n-禁用，默认为y
     */
    private String status;

    /**
     * 广告上架时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 广告下架时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 排列顺序：数值越大越排前面，默认为0
     */
    @Column(name = "sort_no")
    private Integer sortNo;

    /**
     * 广告类别：home-首页，默认为home
     */
    private String type;

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
     * @return image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取广告状态：y-启用；n-禁用，默认为y
     *
     * @return status - 广告状态：y-启用；n-禁用，默认为y
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置广告状态：y-启用；n-禁用，默认为y
     *
     * @param status 广告状态：y-启用；n-禁用，默认为y
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取广告上架时间
     *
     * @return start_time - 广告上架时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置广告上架时间
     *
     * @param startTime 广告上架时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取广告下架时间
     *
     * @return end_time - 广告下架时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置广告下架时间
     *
     * @param endTime 广告下架时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取排列顺序：数值越大越排前面，默认为0
     *
     * @return sort_no - 排列顺序：数值越大越排前面，默认为0
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * 设置排列顺序：数值越大越排前面，默认为0
     *
     * @param sortNo 排列顺序：数值越大越排前面，默认为0
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取广告类别：home-首页，默认为home
     *
     * @return type - 广告类别：home-首页，默认为home
     */
    public String getType() {
        return type;
    }

    /**
     * 设置广告类别：home-首页，默认为home
     *
     * @param type 广告类别：home-首页，默认为home
     */
    public void setType(String type) {
        this.type = type;
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