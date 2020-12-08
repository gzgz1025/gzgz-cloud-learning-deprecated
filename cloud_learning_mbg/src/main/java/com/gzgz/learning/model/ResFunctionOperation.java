package com.gzgz.learning.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "res_function_operation")
public class ResFunctionOperation implements Serializable {
    /**
     * 操作ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 操作名称
     */
    @Column(name = "operation_name")
    private String operationName;

    /**
     * 操作编码
     */
    @Column(name = "operation_code")
    private String operationCode;

    /**
     * 拦截URL前缀
     */
    @Column(name = "block_url_prefix")
    private String blockUrlPrefix;

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
     * 获取操作ID
     *
     * @return id - 操作ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置操作ID
     *
     * @param id 操作ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取操作名称
     *
     * @return operation_name - 操作名称
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 设置操作名称
     *
     * @param operationName 操作名称
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * 获取操作编码
     *
     * @return operation_code - 操作编码
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 设置操作编码
     *
     * @param operationCode 操作编码
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * 获取拦截URL前缀
     *
     * @return block_url_prefix - 拦截URL前缀
     */
    public String getBlockUrlPrefix() {
        return blockUrlPrefix;
    }

    /**
     * 设置拦截URL前缀
     *
     * @param blockUrlPrefix 拦截URL前缀
     */
    public void setBlockUrlPrefix(String blockUrlPrefix) {
        this.blockUrlPrefix = blockUrlPrefix;
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
        sb.append(", operationName=").append(operationName);
        sb.append(", operationCode=").append(operationCode);
        sb.append(", blockUrlPrefix=").append(blockUrlPrefix);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}