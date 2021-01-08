package com.gzgz.learning.annnotaion;

import java.lang.annotation.*;

/**
 * @ClassName: Insert
 * @Description:
 * 定义一个注解
 * 1、有效性（生命周期） Retention -- RetentionPolicy.RUNTIME
 * 2、注解的使用位置 Target -- ElementType.METHOD,方法 字段
 * @Author: pzl
 * @CreateDate: 2021/1/8 14:40
 * @Version: 1.0
 */
//对文档进行识别，javadoc
@Documented
//有效性的策略，runtime运行时， class字节码， sourece源码
@Retention(value= RetentionPolicy.RUNTIME)
//使用的目标 method方法
@Target(value={ElementType.METHOD})
public @interface Insert {
    String[] value();
}
