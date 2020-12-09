package com.gzgz.learning.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "payment")
public class Payment implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "serial")
    private BigDecimal serial;

    private static final long serialVersionUID = 1L;


    public Payment(Long id, BigDecimal serial) {
        this.id = id;
        this.serial = serial;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return serial
     */
    public BigDecimal getSerial() {
        return serial;
    }

    /**
     * @param serial
     */
    public void setSerial(BigDecimal serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serial=").append(serial);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}