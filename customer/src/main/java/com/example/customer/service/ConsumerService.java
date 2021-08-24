package com.example.customer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class ConsumerService {

    @Resource
    private RestTemplate restTemplate;

    public String getName(){
        String name = restTemplate.getForObject("http://service-provider/test/getName",String.class);
        return name;
    }
}
