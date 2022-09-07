package com.semih.monolithicarchitecture.services;

import com.semih.monolithicarchitecture.repository.IProductRepository;
import com.semih.monolithicarchitecture.repository.entity.Product;
import org.springframework.stereotype.Service;


@Service
public class ProductService extends ServiceManager<Product, Long> {
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

}


