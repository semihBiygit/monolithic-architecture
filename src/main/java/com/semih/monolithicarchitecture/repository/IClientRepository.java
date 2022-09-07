package com.semih.monolithicarchitecture.repository;

import com.semih.monolithicarchitecture.repository.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {

}

