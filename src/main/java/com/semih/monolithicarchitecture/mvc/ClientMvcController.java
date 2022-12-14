package com.semih.monolithicarchitecture.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;


import static com.semih.monolithicarchitecture.constants.Urls.*;

@Controller
@RequestMapping(VERSION+WEB+CLIENT)
public class ClientMvcController {
    @GetMapping(INDEX)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("client");
        String manset = "MVC with Thymleaf";
        List<String> nameList =
                Arrays.asList("Semih", "Ali", "Veli", "Ayşe", "Fatma", "Zeynep");
        modelAndView.addObject("names", nameList);
        modelAndView.addObject("manset", manset);
        return modelAndView;
    }
}
