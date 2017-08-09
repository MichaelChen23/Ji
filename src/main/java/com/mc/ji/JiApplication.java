package com.mc.ji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot的application启动类
 * @author mc
 * @date 2017-8-8
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mc.ji.dao")
public class JiApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JiApplication.class, args);
    }
}
