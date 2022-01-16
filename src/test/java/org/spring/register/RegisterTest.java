package org.spring.register;

import org.TestId;
import org.junit.jupiter.api.Test;
import org.spring.register.singleton.Config;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterTest {

    @Test
    @TestId("REGISTER-0001")
    public void testRegisterSingleton()  {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.getBeanFactory().registerSingleton("singletonBean", new Object());


        BeanDefinition hasBeanDefinitionBean = context.getBeanDefinition("hasBeanDefinitionBean");
        System.out.println("hasBeanDefinitionBean: " + hasBeanDefinitionBean);

        System.out.println("singletonBean: " + context.getBean("singletonBean"));
        // 这里会报错，因为 singletonBean 是通过 registerSingleton 进行注入的， 不存在 BeanDefinition。
        BeanDefinition singletonBean = context.getBeanDefinition("singletonBean");
    }
}
