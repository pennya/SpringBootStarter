package com.tunateam.demoServer

import com.tunateam.Holoman
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class HolomanRunner: ApplicationRunner {

    @Autowired
    lateinit var holoman: Holoman

    override fun run(args: ApplicationArguments?) {
        println(holoman)
    }

}