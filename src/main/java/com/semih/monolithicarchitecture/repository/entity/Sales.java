package com.semih.monolithicarchitecture.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "sales")
@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private Long clientId;
    private Long productId;
    private int quantity;
    private Long createdDate;
    private Long updatedDate;
    private int state;

}
