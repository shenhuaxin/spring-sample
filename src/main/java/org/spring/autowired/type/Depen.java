package org.spring.autowired.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Depen {


    @Autowired BaseAbstract base;


    public Depen(BaseAbstract base, ApplicationContext applicationContext) {
        System.out.println(base);
    }

}
