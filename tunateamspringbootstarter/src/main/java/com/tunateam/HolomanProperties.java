package com.tunateam;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Docs
 * https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/html/configuration-metadata.html#configuration-metadata-annotation-processor
 *
 *
 * Not registered via @EnableConfigurationProperties or marked as Spring Component
 * Inspection info : Verifies @ConfigurationProperties setup. New in 2018.3
 * @EnableConfigurationProperties 를 사용하지 않으면 위와 같은 경고로 빨간 줄이 그어진다
 */
@ConfigurationProperties(prefix = "holoman")
public class HolomanProperties {

    private String name;
    private int howLong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }
}
