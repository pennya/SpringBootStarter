package com.duzi.SpringInit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    SampleProperties sampleProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(sampleProperties.name);
        System.out.println(sampleProperties.age);
        System.out.println(sampleProperties.fullName);
    }
}
