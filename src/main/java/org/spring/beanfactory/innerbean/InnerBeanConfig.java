package org.spring.beanfactory.innerbean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class InnerBeanConfig {

    /**
     * Spring内部bean是如何注入的
     */
    @Autowired
    ApplicationContext environment11;

    @Autowired
    Environment environment;
}
