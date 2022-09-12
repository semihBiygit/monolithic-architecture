package com.semih.monolithicarchitecture.services;

import com.semih.monolithicarchitecture.dto.request.ProductSaveRequestDto;
import com.semih.monolithicarchitecture.mapper.ProductMapper;
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

    public Product save(ProductSaveRequestDto dto) {
        return productRepository.save(ProductMapper.INSTANCE.toProduct(dto));
    }

    public Product saveMapper(ProductSaveRequestDto dto) {
        Product product = ProductMapper.INSTANCE.toProduct(dto);
        product.setCreatedDate(System.currentTimeMillis());
        return productRepository.save(product);
    }

}


