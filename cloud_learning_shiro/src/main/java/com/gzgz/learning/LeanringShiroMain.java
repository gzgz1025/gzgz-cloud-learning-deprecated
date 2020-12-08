package com.gzgz.learning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName: LeanringShiroMain
 * @Description:
 * @Author: pzl
 * @CreateDate: 2020/12/7 17:47
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.gzgz.learning.mapper")
public class LeanringShiroMain {
    public static void main(String[] args) {
        SpringApplication.run(LeanringShiroMain.class,args);
    }
}
