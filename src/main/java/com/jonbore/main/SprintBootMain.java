package com.jonbore.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bo.zhou
 * @date 2018/5/19
 */

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.jonbore"})
@MapperScan("com.jonbore.mapper")
public class SprintBootMain {

    public static void main(String[] args){
        SpringApplication.run(SprintBootMain.class, args);
    }
}
