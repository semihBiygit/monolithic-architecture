package com.semih.monolithicarchitecture.services;


import com.semih.monolithicarchitecture.dto.request.FindByIdRequestDto;
import com.semih.monolithicarchitecture.dto.response.GetAllSalesResponseDto;
import com.semih.monolithicarchitecture.repository.IClientRepository;
import com.semih.monolithicarchitecture.repository.IProductRepository;
import com.semih.monolithicarchitecture.repository.ISalesRepository;
import com.semih.monolithicarchitecture.repository.entity.Client;
import com.semih.monolithicarchitecture.repository.entity.Product;
import com.semih.monolithicarchitecture.repository.entity.Sales;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class SalesService extends ServiceManager<Sales, Long> {
    private final ISalesRepository salesRepository;
    private final IClientRepository clientRepository;
    private final IProductRepository productRepository;

    public SalesService(ISalesRepository salesRepository, IClientRepository clientRepository, IProductRepository productRepository) {
        super(salesRepository);
        this.salesRepository = salesRepository;
        this.productRepository = productRepository;
        this.clientRepository = clientRepository;
    }

    public Optional<Sales> findById(FindByIdRequestDto dto) {
        if (dto.getId() != null) {
            return salesRepository.findById(dto.getId());
        }
        return Optional.empty();
    }

    public List<GetAllSalesResponseDto> findAllDto() {
        List<Sales> salesList = salesRepository.findAll();
        List<GetAllSalesResponseDto> responseDtoList = new ArrayList<>();
        salesList.forEach(sales -> {
            Optional<Client> client = clientRepository.findById(sales.getClientId());
            Optional<Product> product = productRepository.findById(sales.getProductId());
            if (client.isPresent() && product.isPresent()) {
                responseDtoList.add(GetAllSalesResponseDto.builder()
                        .id(sales.getId())
                        .quantity(sales.getQuantity())
                        .price(sales.getPrice())
                        .total(sales.getPrice() * sales.getQuantity())
                        .createdDate(Instant.ofEpochMilli(sales.getCreatedDate()).atZone(ZoneId.systemDefault()).toLocalDate())
                        .productName(product.get().getName() + " : " + product.get().getLabel() + " , " + product.get().getModel())
                        .clientName(client.get().getName())
                        .clientId(client.get().getId())
                        .productId(product.get().getId())
                        .build());

            } else {

                System.out.println("Client or Product not found [Sales Id]=  " + sales.getId());
            }

        });
        return responseDtoList;
    }

    public void save(Long clientId, Long productId, Integer quantity, Double price) {
        salesRepository.save(Sales.builder()
                .clientId(clientId)
                .productId(productId)
                .price(price)
                .quantity(quantity)
                .createdDate(System.currentTimeMillis())
                .build());
    }

    public void update(Long id, Long clientId, Long productId, Integer quantity, Double price) {
        Sales sales = salesRepository.findById(id).get();
        sales.setClientId(clientId);
        sales.setProductId(productId);
        sales.setQuantity(quantity);
        sales.setPrice(price);
        sales.setUpdatedDate(System.currentTimeMillis());
        salesRepository.save(sales);
    }
}


