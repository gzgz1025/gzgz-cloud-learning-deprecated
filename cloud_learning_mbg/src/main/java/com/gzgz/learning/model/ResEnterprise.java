package com.gzgz.learning.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "res_enterprise")
public class ResEnterprise implements Serializable {
    /**
     * 企业ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 企业代码
     */
    @Column(name = "enterprise_code")
    private String enterpriseCode;

    /**
     * 企业名称
     */
    @Column(name = "enterprise_name")
    private String enterpriseName;

    /**
     * 纳税人识别号
     */
    @Column(name = "taxpayer_id_number")
    private String taxpayerIdNumber;

    /**
     * 企业类型
     */
    @Column(name = "enterprise_type")
    private String enterpriseType;

    /**
     * 企业地址
     */
    @Column(name = "enterprise_address")
    private String enterpriseAddress;

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
     * 获取企业ID
     *
     * @return id - 企业ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置企业ID
     *
     * @param id 企业ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取企业代码
     *
     * @return enterprise_code - 企业代码
     */
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    /**
     * 设置企业代码
     *
     * @param enterpriseCode 企业代码
     */
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    /**
     * 获取企业名称
     *
     * @return enterprise_name - 企业名称
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * 设置企业名称
     *
     * @param enterpriseName 企业名称
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    /**
     * 获取纳税人识别号
     *
     * @return taxpayer_id_number - 纳税人识别号
     */
    public String getTaxpayerIdNumber() {
        return taxpayerIdNumber;
    }

    /**
     * 设置纳税人识别号
     *
     * @param taxpayerIdNumber 纳税人识别号
     */
    public void setTaxpayerIdNumber(String taxpayerIdNumber) {
        this.taxpayerIdNumber = taxpayerIdNumber;
    }

    /**
     * 获取企业类型
     *
     * @return enterprise_type - 企业类型
     */
    public String getEnterpriseType() {
        return enterpriseType;
    }

    /**
     * 设置企业类型
     *
     * @param enterpriseType 企业类型
     */
    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    /**
     * 获取企业地址
     *
     * @return enterprise_address - 企业地址
     */
    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    /**
     * 设置企业地址
     *
     * @param enterpriseAddress 企业地址
     */
    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
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
        sb.append(", enterpriseCode=").append(enterpriseCode);
        sb.append(", enterpriseName=").append(enterpriseName);
        sb.append(", taxpayerIdNumber=").append(taxpayerIdNumber);
        sb.append(", enterpriseType=").append(enterpriseType);
        sb.append(", enterpriseAddress=").append(enterpriseAddress);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}