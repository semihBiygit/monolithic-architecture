package com.semih.monolithicarchitecture.controller;

import com.semih.monolithicarchitecture.dto.request.ProductSaveRequestDto;
import com.semih.monolithicarchitecture.repository.entity.Product;
import com.semih.monolithicarchitecture.services.ProductService;
import com.semih.monolithicarchitecture.utils.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/save")
    public ResponseEntity<Product> save(Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

    @PostMapping("/saveparam")
    public ResponseEntity<Product> saveParameter(String name, String label,
                                                 String model, Double price) {
        Product product = Product.builder()
                .price(price)
                .label(label)
                .model(model)
                .name(name).build();
        return ResponseEntity.ok(productService.save(product));
    }
    @PostMapping("/saveparamdto")
    public ResponseEntity<Product> saveParamDto(ProductSaveRequestDto dto){
        return ResponseEntity.ok(productService.saveMapper(dto));
    }

}
