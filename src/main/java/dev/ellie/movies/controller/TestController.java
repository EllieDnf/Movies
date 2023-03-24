package dev.ellie.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private String sth = "Hi Hannah";
    @GetMapping("/hello")
    public String getSth(){
        return sth;
    }
}
