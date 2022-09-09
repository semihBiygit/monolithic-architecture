package com.semih.monolithicarchitecture.controller;

import com.semih.monolithicarchitecture.services.ProductService;
import com.semih.monolithicarchitecture.utils.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("saveAllDemo")
    public ResponseEntity<String> saveAllDemo() {
        productService.saveAll(new Datas().getProductList());
        return ResponseEntity.ok("Product Data Added.");
    }

}
