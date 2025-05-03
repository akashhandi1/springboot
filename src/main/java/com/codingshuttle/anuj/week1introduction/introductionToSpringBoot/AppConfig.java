package com.codingshuttle.anuj.week1introduction.introductionToSpringBoot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton") //for different object prototype used & for same object sigleton(default) used
    Apple getApple(){
        return new Apple();
    }
 // request - single bean for single request for api one way (client → server)
    // websocket - two way full duplex (client ↔ server)
}
