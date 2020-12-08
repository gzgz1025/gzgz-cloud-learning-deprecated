package com.gzgz.learning.controller;

import com.gzgz.learning.common.asserts.Result;
import com.gzgz.learning.dto.ResUserDto;
import com.gzgz.learning.service.ResUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ResUserController
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/8 11:17
 * @Version: 1.0
 */
@RestController
@RequestMapping("/res/user/")
@Api(tags = "用户管理")
public class ResUserController {
    @Autowired
    private ResUserService resUserService;

    @GetMapping(value = "/queryUserByName")
    @ApiOperation(value = "通过用户名查用户信息")
    public Result<ResUserDto> queryUserByName(@RequestParam(value = "name") String name){
        ResUserDto resUserDto = resUserService.queryUserByName(name);
        return Result.success(resUserDto);
    }
}
