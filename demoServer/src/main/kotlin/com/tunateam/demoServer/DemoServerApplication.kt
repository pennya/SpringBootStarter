package com.tunateam.demoServer

import com.tunateam.Holoman
import org.apache.catalina.startup.Tomcat
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@SpringBootApplication
class DemoServerApplication {

    /**
     * @ComponentScan 으로 먼저 스캔해서 Bean 으로 등록하고
     * @EnableAutoConfiguration 으로 dependency 를 스캔해서 Bean 으로 등록하므로
     * 아래 정의 된 Bean 은 오버라이드 되어 나중에 등록된 Bean 으로 설정된다.
     *
     * @ConditionalOnMissingBean 세팅이 되있으므로 @ComponentScan 로 스캔된 Bean 은 무시된다.
     */
    /*@Bean
    fun holoman(): Holoman {
        return Holoman().apply {
            name = "TestMan"
            howLong = 60
        }
    }*/
}

fun main(args: Array<String>) {
    runApplication<DemoServerApplication>(*args)


    /**
     * 스프링 부트 내장 서버 없이 톰캣 객체만 가지고 서버를 만듬.
     * 이런 비슷한 설정이 AutoConfigure 와 관련이 있다.
     */
    /*val tomcat = Tomcat()
    tomcat.setPort(8080)

    val context = tomcat.addContext("/", "/")
    val servlet = object: HttpServlet() {
        override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
            resp.writer.apply {
                println("<html><head><title>")
                println("Hey, Tomcat")
                println("</title></head>")
                println("<body><h1>Hello Tomcat</h1></body>")
                println("</html>")
            }
        }
    }
    val servletName = "helloServlet"
    tomcat.addServlet("/", servletName, servlet)
    context.addServletMappingDecoded("/hello", servletName)

    tomcat.start()
    tomcat.server.await()*/
}
