package org.spring.autowired.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemoteService {

    @Autowired
    @Qualifier("restTemplateName")
    @LoadBalance
    private List<RestTemplate> restTemplate;

}
