package org.spring.autowired.circularreference;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularReferenceApp {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CircularReferenceConfig.class);
        context.getBean(A.class);
    }
}
