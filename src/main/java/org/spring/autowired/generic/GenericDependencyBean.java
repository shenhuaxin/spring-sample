package org.spring.autowired.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericDependencyBean {


    @Autowired
    GenericBean<Integer> integerGenericBean;
}
