package com.tunateam;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 우측 Maven 탭 > Lifecycle > install
 * install 을 하면 이 프로젝트를 빌드해서 생긴 jar 파일을 다른 maven 프로젝트에서 가져다 쓸 수 있도록
 * 로컬 메이븐 저장소에 저장한다.
 *
 * 과연 다른 gradle 프로젝트도 가능한가?
 * mavenLocal() 을 이용하여 gradle project 에서 implementation 할 수 있다.
 */
@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    @Bean
    @ConditionalOnMissingBean // 이 타입에 대한 Bean 이 없을 때만 아래 코드가 Bean 에 등록된다.
    public Holoman holoman(HolomanProperties properties) {
        Holoman holoman = new Holoman();
        holoman.setHowLong(properties.getHowLong());
        holoman.setName(properties.getName());
        return holoman;
    }

}
