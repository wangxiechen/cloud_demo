package com.wxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication2.class,args);
    }
}
