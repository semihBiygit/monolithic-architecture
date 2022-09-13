package com.semih.monolithicarchitecture.mvc;

import com.semih.monolithicarchitecture.repository.entity.Sales;
import com.semih.monolithicarchitecture.services.ClientService;
import com.semih.monolithicarchitecture.services.ProductService;
import com.semih.monolithicarchitecture.services.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static com.semih.monolithicarchitecture.constants.Urls.*;

@Controller
@RequestMapping(VERSION+WEB+SALES)
@RequiredArgsConstructor
public class SalesMvcController {
    private final SalesService salesService;
    private final ClientService clientService;
    private final ProductService productService;

    @GetMapping(INDEX)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sales");
        modelAndView.addObject("salesList", salesService.findAllDto());
        modelAndView.addObject("clientList", clientService.findAll());
        modelAndView.addObject("productList", productService.findAll());
        return modelAndView;
    }

    @PostMapping(SAVE)
    public ModelAndView satis(Long clientId, Long productId, Integer quantity, Double price) {
        salesService.save(clientId, productId, quantity, price);
        return new ModelAndView("redirect:index");
    }
}
