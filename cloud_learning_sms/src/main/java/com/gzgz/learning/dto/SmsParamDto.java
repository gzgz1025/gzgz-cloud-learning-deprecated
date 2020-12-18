package com.gzgz.learning.dto;

import lombok.Data;

/**
 * @ClassName: SmsParamDto
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/17 15:13
 * @Version: 1.0
 */
@Data
public class SmsParamDto {
    /**
     *
     */
    private String appId;

    private String appKey;

    /**
     * 短信签名
     */
    private String signName;

    /**
     * 短信模板
     */
    private String smsTemplateCode;

    /**
     * 验证码
     */
    private String content;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 方式
     */
    private String smsType;
}
