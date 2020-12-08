package com.gzgz.learning.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "res_page_element")
public class ResPageElement implements Serializable {
    /**
     * 页面元素ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 页面元素代码
     */
    @Column(name = "element_code")
    private String elementCode;

    /**
     * 状态
     */
    @Column(name = "status")
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取页面元素ID
     *
     * @return id - 页面元素ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置页面元素ID
     *
     * @param id 页面元素ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取页面元素代码
     *
     * @return element_code - 页面元素代码
     */
    public String getElementCode() {
        return elementCode;
    }

    /**
     * 设置页面元素代码
     *
     * @param elementCode 页面元素代码
     */
    public void setElementCode(String elementCode) {
        this.elementCode = elementCode;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", elementCode=").append(elementCode);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}