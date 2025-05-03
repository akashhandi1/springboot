package com.codingshuttle.anuj.week1introduction.introductionToSpringBoot;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {

    void eatApple(){
        System.out.println("I am eating Apple");
    }

    @PostConstruct
    void callThisBeforeAppleUsed(){
        System.out.println("Creating apple before it used");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying apple bean");
    }
}
