package org.spring.autowired.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class QualifierConfig {

    @Bean
    @LoadBalance
    public RestTemplate restTemplate1() {
        return new RestTemplate("restTemplate1");
    }


    @Bean
    public RestTemplate restTemplate2() {
        return new RestTemplate("restTemplate2");
    }


    @Qualifier("restTemplateName")
    @Bean
    public RestTemplate restTemplate3() {
        return new RestTemplate("restTemplate3");
    }

//    @Qualifier("restTemplateName")
//    @Bean
//    public RestTemplate restTemplate4() {
//        return new RestTemplate("restTemplate4");
//    }

    @Qualifier("restTemplateName1")
    @Bean
    public RestTemplate restTemplate5() {
        return new RestTemplate("restTemplate5");
    }
}
