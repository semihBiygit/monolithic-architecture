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

import static com.semih.monolithicarchitecture.constants.Urls.*;

@RestController
@RequestMapping(VERSION + API + SALES)
@RequiredArgsConstructor
public class SalesController {

    private final SalesService salesService;

    @GetMapping(SAVE_ALL)
    public ResponseEntity<String> saveAllDemo() {
        salesService.saveAll(new Datas().getSalesList());
        return ResponseEntity.ok("Sales Data Added.");
    }

    @PostMapping(FIND_ALL)
    public ResponseEntity<List<Sales>> findAll() {
        return ResponseEntity.ok(salesService.findAll());
    }

    @PostMapping(GET_ALL)
    public ResponseEntity<List<GetAllSalesResponseDto>> findAllDto() {
        return ResponseEntity.ok(salesService.findAllDto());
    }

    @PostMapping(FIND_BY_ID)
    public ResponseEntity<Sales> findById(FindByIdRequestDto dto) {
        Optional<Sales> sales = salesService.findById(dto);
        if (sales.isPresent()) {
            return ResponseEntity.ok(sales.get());
        }
        return ResponseEntity.ok(new Sales());
    }
}
