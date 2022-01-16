package org.spring.autowired.generic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("org.spring.autowired.generic")
@Configuration
public class GenericConfig {


    @Bean
    public GenericBean genericBean() {
        return new GenericBean<String>("beanName");
    }


    @Bean
    public GenericBean<Integer> integerGenericBean() {
        return new GenericBean<Integer>(1);
    }


}
