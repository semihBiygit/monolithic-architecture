package com.semih.monolithicarchitecture.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "sales")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    Long clientId;
    Long productId;
    int quantity;
    Double price;
    int state;
    Long createdDate;
    Long updatedDate;

}
