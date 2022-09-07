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
@Table(name = "product")
@Entity
public class Product {
    @Id
    @SequenceGenerator(name = "product_seq", sequenceName = "product_seq", allocationSize = 1, initialValue = 100)
    @GeneratedValue(generator ="product_seq" ,strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 300,nullable = false)
    private String name;
    private String label;
    @Column(nullable = false)
    private Double price;

}
