package com.eric.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注解指定项目为springboot，由此当程序入口
 * 自动装备web依赖的环境
 */
@SpringBootApplication
public class SpringBootTestApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootTestApplication.class,args);
    }
}
