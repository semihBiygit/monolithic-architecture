package com.semih.monolithicarchitecture.controller;

import com.semih.monolithicarchitecture.dto.request.FindByIdRequestDto;
import com.semih.monolithicarchitecture.dto.response.GetAllSalesResponseDto;
import com.semih.monolithicarchitecture.repository.entity.Sales;
import com.semih.monolithicarchitecture.services.SalesService;
import com.semih.monolithicarchitecture.utils.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sales")
@RequiredArgsConstructor
public class SalesController {

    private final SalesService salesService;

    @GetMapping("/saveAllDemo")
    public ResponseEntity<String> saveAllDemo() {
        salesService.saveAll(new Datas().getSalesList());
        return ResponseEntity.ok("Sales Data Added.");
    }
    @PostMapping("/findAll")
    public ResponseEntity<List<Sales>> findAll() {
        return ResponseEntity.ok(salesService.findAll());
    }

    @PostMapping("/getall")
    public ResponseEntity<List<GetAllSalesResponseDto>> findAllDto() {
        return ResponseEntity.ok(salesService.findAllDto());
    }

    @PostMapping("/findById")
    public ResponseEntity<Sales> findById(FindByIdRequestDto dto) {
        Optional<Sales> sales = salesService.findById(dto);
        if (sales.isPresent()) {
            return ResponseEntity.ok(sales.get());
        }
        return ResponseEntity.ok(new Sales());
    }
}
