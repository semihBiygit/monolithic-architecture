package com.semih.monolithicarchitecture.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "client")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {
    @Id
    @SequenceGenerator(name = "sq_tblmusteri_id", sequenceName = "sq_tblmusteri_id", allocationSize = 5, initialValue = 100)
    @GeneratedValue(generator = "sq_tblmusteri_id")
    Long id;
    String name;
    String lastname;
    String address;
    String phone;
    String email;
    Long createdDate;
    Long updatedDate;
    /**
     * 0: passive
     * 1: active
     * 2: deleted
     * 3: blocked
     */
    int state;
}
