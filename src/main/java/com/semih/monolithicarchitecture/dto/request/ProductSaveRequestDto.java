package com.semih.monolithicarchitecture.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductSaveRequestDto {
    String name;
    String label;
    String model;
    Double price;
}
