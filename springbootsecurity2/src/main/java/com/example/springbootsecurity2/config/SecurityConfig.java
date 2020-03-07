package com.example.springbootsecurity2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

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

    @Bean
    public PasswordEncoder passwordEncoder() {
        // 패스워드 인코더를 사용하지 않는 방식으로 절대 사용하면 안됨. 빠르게 테스트 하기 위해서만 잠시 사용할 것
        return NoOpPasswordEncoder.getInstance();
    }
}
