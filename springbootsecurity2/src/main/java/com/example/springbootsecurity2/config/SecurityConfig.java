package com.example.springbootsecurity2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/hello").permitAll() // 루트와 hello 로 시작하는 URL은 권한을 모두 주고
                .anyRequest().authenticated() // 그 외에는 인증이 필요하다
                .and()
                .formLogin() // 로그인 창을 통해서 할꺼고
                .and()
                .httpBasic(); // 기본 http basic 을 사용한다
    }
}
