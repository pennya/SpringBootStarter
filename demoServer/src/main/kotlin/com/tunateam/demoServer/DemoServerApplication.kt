package com.tunateam.demoServer

import com.tunateam.Holoman
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoServerApplication {

    /**
     * @ComponentScan 으로 먼저 스캔해서 Bean 으로 등록하고
     * @EnableAutoConfiguration 으로 dependency 를 스캔해서 Bean 으로 등록하므로
     * 아래 정의 된 Bean 은 오버라이드 되어 나중에 등록된 Bean 으로 설정된다.
     */
    @Bean
    fun holoman(): Holoman {
        return Holoman().apply {
            name = "TestMan"
            howLong = 60
        }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoServerApplication>(*args)
}
