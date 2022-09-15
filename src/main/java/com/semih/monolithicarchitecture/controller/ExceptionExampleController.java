package com.semih.monolithicarchitecture.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionExampleController {

    @RequestMapping("/test")
    public String exception() {
        throw new RuntimeException("Exception Example");
    }
}
