package org.spring.autowired.generic;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class GenericConfigTest {


    /**
     * 这里就是 @Autowired注解注入时的, 泛型回退问题
     */
    @Test
    public void testGenericFallback() {
        ApplicationContext context = new AnnotationConfigApplicationContext(GenericConfig.class);
        GenericDependencyBean bean = context.getBean(GenericDependencyBean.class);
        System.out.println(bean);
    }

}