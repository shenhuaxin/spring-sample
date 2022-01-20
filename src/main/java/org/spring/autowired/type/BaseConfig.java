package org.spring.autowired.type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {


    @Bean
    public Base base() {
        return new BaseWrapper();
    }

}
