package com.semih.monolithicarchitecture.services;

import com.semih.monolithicarchitecture.repository.IClientRepository;
import com.semih.monolithicarchitecture.repository.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClientService extends ServiceManager<Client, Long> {
    private final IClientRepository clientRepository;

    public ClientService(IClientRepository clientRepository) {
        super(clientRepository);
        this.clientRepository = clientRepository;
    }

    public List<Client> findAllByAddress(String address) {
        return clientRepository.findAllByAddress(address);
    }

    public List<Client> findAllByNameLike(String name) {
        return clientRepository.findAllByNameLike(name);
    }

    public List<Client> findByNameStartsWithAndAddressStartsWith(String name, String address) {
        return clientRepository.findByNameStartsWithAndAddressStartsWith(name, address);
    }

    public List<Client> findAllByCreatedDateGreaterThan(Long createdDate) {
        return clientRepository.findAllByCreatedDateGreaterThan(createdDate);
    }

    public Optional<Client> findTopOptionalByName(String name) {
        return clientRepository.findTopOptionalByName(name);
    }
    public List<Client> findAllByCreatedDateBetween(Long startDate, Long endDate) {
        return clientRepository.findAllByCreatedDateBetween(startDate, endDate);
    }


}
