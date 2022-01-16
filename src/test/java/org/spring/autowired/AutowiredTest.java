package org.spring.autowired;

import org.TestId;
import org.junit.jupiter.api.Test;
import org.spring.autowired.generic.GenericConfig;
import org.spring.autowired.generic.GenericDependencyBean;
import org.spring.autowired.qualifier.QualifierConfig;
import org.spring.autowired.qualifier.RemoteService;
import org.spring.autowired.selfreference.Config;
import org.spring.autowired.selfreference.SelfReferenceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class AutowiredTest {


    /**
     * 1. 泛型注入匹配问题
     * 2. 泛型注入回退问题
     */
    @Test
    @TestId("AUTOWIRED-0001")
    public void testGenericFallback() {
        // 泛型注入匹配问题
        ApplicationContext context = new AnnotationConfigApplicationContext(GenericConfig.class);
        GenericDependencyBean bean = context.getBean(GenericDependencyBean.class);

        // 泛型回退问题
//        ApplicationContext context = new AnnotationConfigApplicationContext(GenericConfig.class);
//        GenericDependencyBean bean = context.getBean(GenericDependencyBean.class);

        System.out.println(bean);

    }


    @Test
    @TestId("AUTOWIRED-002")
    public void testSelfReferenceFallback() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SelfReferenceBean bean = context.getBean(SelfReferenceBean.class);
        System.out.println(bean);
    }


    @Test
    @TestId("AUTOWIRED-003")
    public void testQualifier() {
        ApplicationContext context = new AnnotationConfigApplicationContext(QualifierConfig.class);
        RemoteService bean = context.getBean(RemoteService.class);
        System.out.println(bean);
    }


}