package com.gzgz.learning.service;

import com.gzgz.learning.dto.ResUserDto;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/8 11:35
 * @Version: 1.0
 */
public interface ResUserService {
    ResUserDto queryUserByName(String name);
}
