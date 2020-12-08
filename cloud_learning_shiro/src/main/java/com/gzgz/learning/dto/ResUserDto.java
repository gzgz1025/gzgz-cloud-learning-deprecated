package com.gzgz.learning.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: UserDto
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/8 11:36
 * @Version: 1.0
 */
@Data
public class ResUserDto {
    @ApiModelProperty(value = "用户ID")
    private Long id;

    @ApiModelProperty(value = "用户代码")
    private String userCode;

    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @ApiModelProperty(value = "电话")
    private Integer mobilePhone;


    @ApiModelProperty(value = "部门ID")
    private Long departmentId;

    @ApiModelProperty(value = "上次登录时间")
    private Date lastLoginTime;

    @ApiModelProperty(value = "登录次数")
    private Integer loginNum;

    @ApiModelProperty(value = "状态")
    private String status;
}
