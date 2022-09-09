package com.semih.monolithicarchitecture.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "product")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column(length = 300, nullable = false)
    String name;
    String label;
    String model;
    @Column(nullable = false)
    Double price;
    int stock;
    int state;
    Long createdDate;
    Long updatedDate;

}
