package com.semih.monolithicarchitecture.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
@Entity
public class Client {
    @Id
    @SequenceGenerator(name = "client_seq", sequenceName = "client_seq", allocationSize = 5, initialValue = 100)
    @GeneratedValue(generator = "client_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String lastname;
    private String address;
    private String phone;
    private String email;
    private Long createdDate;
    private Long updatedDate;
    /**
     * 0: passive
     * 1: active
     * 2: deleted
     * 3: blocked
     */
    int state;
}
