package com.tunateam.demoServer

import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class PortListener: ApplicationListener<ServletWebServerInitializedEvent> {
    override fun onApplicationEvent(event: ServletWebServerInitializedEvent) {
        val applicationContext = event.applicationContext
        println("port = ${applicationContext.webServer.port}")
    }
}