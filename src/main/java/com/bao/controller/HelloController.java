package com.bao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nannan on 2018/5/25.
 */
@RestController
@Slf4j
public class HelloController {
    @GetMapping("/v1/test")
    public String test(){
        log.info("hello");
        return "hello";
    }
}
