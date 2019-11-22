package com.yuzhi.tool.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuzhi
 */
@SpringBootApplication
@MapperScan("com.yuzhi.tool.demo.mapper")
public class ToolApp {
    public static void main(String[] args) {
        SpringApplication.run(ToolApp.class,args);
    }
}
