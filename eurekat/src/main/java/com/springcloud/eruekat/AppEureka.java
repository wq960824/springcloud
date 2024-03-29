package com.springcloud.eruekat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //声明这是一个 eureka服务
public class AppEureka {

    public static  void main(String args[]){
        SpringApplication.run(AppEureka.class,args);
    }
}
