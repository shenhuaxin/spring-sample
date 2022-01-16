package org.spring.autowired.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericDependencyBean {


    @Autowired
//    List<GenericBean<Integer>> integerGenericBean;
    List<GenericBean<Object>> integerGenericBean;
}
