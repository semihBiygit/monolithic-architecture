package com.semih.monolithicarchitecture.repository;

import com.semih.monolithicarchitecture.repository.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISalesRepository extends JpaRepository<Sales, Long> {

}


