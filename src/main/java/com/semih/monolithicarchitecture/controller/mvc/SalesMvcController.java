package com.semih.monolithicarchitecture.controller.mvc;

import com.semih.monolithicarchitecture.services.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/WEB/sales")
@RequiredArgsConstructor
public class SalesMvcController {
    private final SalesService salesService;

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sales");
        modelAndView.addObject("salesList", salesService.findAllDto());
        return modelAndView;
    }
}
