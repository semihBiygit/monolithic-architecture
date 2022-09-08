package com.semih.monolithicarchitecture.repository;

import com.semih.monolithicarchitecture.repository.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {

    List<Client> findAllByAddress(String address);

    List<Client> findAllByNameLike(String name);

    List<Client> findByNameStartsWithAndAddressStartsWith(String name, String address);

    List<Client> findAllByCreatedDateGreaterThan(Long createdDate);

    Optional<Client> findTopOptionalByName(String name);
    List<Client> findAllByCreatedDateBetween(Long startDate, Long endDate);


}

