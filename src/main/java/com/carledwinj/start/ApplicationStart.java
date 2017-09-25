package com.carledwinj.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //@Configuration @EnableAutoConfiguration @ComponentScan
/*@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.carledwinj.endpoint", "com.carledwinj.util"})
*/
public class ApplicationStart {

    public static void main(String[] args){
        SpringApplication.run(ApplicationStart.class, args);
    }
}
