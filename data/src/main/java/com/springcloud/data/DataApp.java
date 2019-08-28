package com.springcloud.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.springcloud.data.controller", "com.springcloud.data.service","com.springcloud.data.properties"})
public class DataApp {
    public static void main(String args[]){
        SpringApplication.run(DataApp.class,args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
         return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
