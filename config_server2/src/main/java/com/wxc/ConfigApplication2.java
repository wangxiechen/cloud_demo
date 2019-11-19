package com.wxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication2.class,args);
    }
}
