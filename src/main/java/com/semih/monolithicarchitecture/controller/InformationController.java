package com.semih.monolithicarchitecture.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.semih.monolithicarchitecture.constants.Urls.*;

@RestController
@RequestMapping(VERSION + API + INFORMATION)
public class InformationController {

    @Value("${myapplication.info}")
    private String info;
    @Value("${myapplication.description}")
    private String description;

    @RequestMapping(INFO)
    public String info() {
        return info;
    }

    @RequestMapping(DESCRIPTION)
    public String description() {
        return description;
    }

}
