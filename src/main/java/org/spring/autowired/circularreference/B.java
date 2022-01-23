package org.spring.autowired.circularreference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {


    @Autowired
    A a;
}
