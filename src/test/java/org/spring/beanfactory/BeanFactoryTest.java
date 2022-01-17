package org.spring.beanfactory;

import org.TestId;
import org.junit.jupiter.api.Test;
import org.spring.beanfactory.beanfactoryprocessor.BeanFactoryPostProcessorConfig;
import org.spring.beanfactory.beanfactoryprocessor.CustomBeanFactoryPostProcessor;
import org.spring.beanfactory.innerbean.InnerBeanConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@TestId("BEANFACTORY-")
public class BeanFactoryTest {


    @Test
    @TestId("0001")
    public void testBeanFactory() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 打印默认情况下所有的beanDefinition
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(beanDefinitionNames);
        // 测试是否有 beanFactory 这个beanDefinition
        BeanDefinition beanFactory = context.getBeanDefinition("beanFactory");
        System.out.println(beanFactory);


    }


    @Test
    @TestId("0002")
    public void testEnvironment() {
        ApplicationContext environmentContext = new AnnotationConfigApplicationContext(InnerBeanConfig.class);
        String[] beanDefinitionNames1 = environmentContext.getBeanDefinitionNames();
        System.out.println(beanDefinitionNames1);
    }


    @Test
    @TestId("0003")
    public void testBeanFactoryPostProcessor() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
        context.addBeanFactoryPostProcessor(new CustomBeanFactoryPostProcessor());

        CustomBeanFactoryPostProcessor bean = context.getBean(CustomBeanFactoryPostProcessor.class);
        System.out.println(bean);
    }

}
