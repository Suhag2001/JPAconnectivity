package com.bootcoding.JPAConnectivity;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JpaConnectivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaConnectivityApplication.class, args);
        run();
    }

    public static void run()  {
        System.out.println("Welcome to Spring Boot App!");
    }
}
