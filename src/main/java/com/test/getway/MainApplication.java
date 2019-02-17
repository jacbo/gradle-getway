package com.test.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.concurrent.CountDownLatch;

//@EnableEurekaClient
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        try {
//            ClassLoader classLoader = Reflection.getCallerClass().getClassLoader();
//            ClassLoader classLoader = MainApplication.class.getClassLoader();
//            Class cls = classLoader.loadClass("org.springframework.boot.web.servlet.ServletRegistrationBean");
//            Class cls = classLoader.loadClass("org.springframework.boot.context.embedded.ServletRegistrationBean");
//            System.out.println(cls);
//            CountDownLatch
            SpringApplication.run(MainApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
