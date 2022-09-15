package com.semih.monolithicarchitecture.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GetAllSalesResponseDto {
    private Long id;
    private Long clientId;
    private Long productId;
    private String clientName;
    private String productName;
    private int quantity;
    private Double price;
    private Double total;
    private LocalDate createdDate;
}
