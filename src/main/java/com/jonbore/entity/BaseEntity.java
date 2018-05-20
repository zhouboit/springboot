package com.jonbore.entity;

import java.util.Date;

/**
 * 实体类基类
 *
 * @author bo.zhou
 * @date 2018/5/19
 */
public abstract class BaseEntity implements java.io.Serializable {
    private static final long serialVersionUID = 3479841066902443604L;
    /**
     * 主键ID
     */
    private String id;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新时间
     */
    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
