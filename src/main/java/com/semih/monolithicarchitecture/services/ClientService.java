package com.semih.monolithicarchitecture.services;

import com.semih.monolithicarchitecture.repository.IClientRepository;
import com.semih.monolithicarchitecture.repository.entity.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService extends ServiceManager<Client, Long> {
    private final IClientRepository clientRepository;

    public ClientService(IClientRepository clientRepository) {
        super(clientRepository);
        this.clientRepository = clientRepository;
    }

}
