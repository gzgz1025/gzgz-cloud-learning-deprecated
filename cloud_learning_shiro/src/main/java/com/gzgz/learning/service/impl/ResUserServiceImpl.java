package com.gzgz.learning.service.impl;

import com.gzgz.learning.common.utils.BeanCopyUtil;
import com.gzgz.learning.dto.ResUserDto;
import com.gzgz.learning.mapper.ResUserMapper;
import com.gzgz.learning.model.ResUser;
import com.gzgz.learning.service.ResUserService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

/**
 * @ClassName: ResUserServiceImpl
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/8 14:39
 * @Version: 1.0
 */
public class ResUserServiceImpl implements ResUserService {

    @Autowired
    private ResUserMapper resUserMapper;
    @Override
    public ResUserDto queryUserByName(String name) {
        ResUser resUser = resUserMapper.selectOneByExample(new Example.Builder(ResUser.class).where(WeekendSqls.<ResUser>custom().andEqualTo(ResUser::getUserName, name)).build());
        return (ResUserDto) BeanCopyUtil.getBean(resUser,ResUserDto.class);
    }
}
