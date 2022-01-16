package org.spring.autowired.selfreference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelfReferenceBean {

    @Autowired
    SelfReferenceBean selfReferenceBean;
}
