package com.semih.monolithicarchitecture.services;


import com.semih.monolithicarchitecture.repository.ISalesRepository;
import com.semih.monolithicarchitecture.repository.entity.Sales;
import org.springframework.stereotype.Service;



@Service
public class SalesService extends ServiceManager<Sales, Long> {
    private final ISalesRepository salesRepository;

    public SalesService(ISalesRepository salesRepository) {
        super(salesRepository);
        this.salesRepository = salesRepository;
    }

}


