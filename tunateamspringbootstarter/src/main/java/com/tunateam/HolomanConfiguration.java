package com.tunateam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 우측 Maven 탭 > Lifecycle > install
 * install 을 하면 이 프로젝트를 빌드해서 생긴 jar 파일을 다른 maven 프로젝트에서 가져다 쓸 수 있도록
 * 로컬 메이븐 저장소에 저장한다.
 *
 * 과연 다른 gradle 프로젝트도 가능한가 ?
 */
@Configuration
public class HolomanConfiguration {

    @Bean
    public Holoman holoman() {
        Holoman holoman = new Holoman();
        holoman.setHowLong(5);
        holoman.setName("JHKIM");
        return holoman;
    }

}
