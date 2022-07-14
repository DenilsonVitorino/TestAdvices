package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
    public String restString(String url) {
        return new RestTemplate().getForObject(url,String.class);
    }
}
