package com.gzgz.learning.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "fk_page_element_ref_authority")
public class FkPageElementRefAuthority implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 页面元素ID
     */
    @Column(name = "element_id")
    private Long elementId;

    /**
     * 权限ID
     */
    @Column(name = "authority_id")
    private Long authorityId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取页面元素ID
     *
     * @return element_id - 页面元素ID
     */
    public Long getElementId() {
        return elementId;
    }

    /**
     * 设置页面元素ID
     *
     * @param elementId 页面元素ID
     */
    public void setElementId(Long elementId) {
        this.elementId = elementId;
    }

    /**
     * 获取权限ID
     *
     * @return authority_id - 权限ID
     */
    public Long getAuthorityId() {
        return authorityId;
    }

    /**
     * 设置权限ID
     *
     * @param authorityId 权限ID
     */
    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", elementId=").append(elementId);
        sb.append(", authorityId=").append(authorityId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}