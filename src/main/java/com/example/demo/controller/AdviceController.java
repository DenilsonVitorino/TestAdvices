package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.RestService;

@RestController
@RequestMapping("/advice")
public class AdviceController {

    private RestService restService;
    private String url;

    public AdviceController() {
        restService = new RestService();
        url = "https://api.adviceslip.com/advice";
    }

    @GetMapping("/test")
    public String test() {
        return "Hello World!";
    }

    @GetMapping
    public String getAdvice() {
        return restService.restString(url);
    }
}
