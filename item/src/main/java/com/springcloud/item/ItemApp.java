package com.springcloud.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.springcloud.item.controller","com.springcloud.item.service"})
public class ItemApp {
    public static void main(String args[]){
        SpringApplication.run(ItemApp.class,args);
    }
}
