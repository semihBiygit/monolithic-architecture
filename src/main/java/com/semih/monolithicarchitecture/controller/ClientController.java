package com.semih.monolithicarchitecture.controller;

import com.semih.monolithicarchitecture.repository.entity.Client;
import com.semih.monolithicarchitecture.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/save")
    public ResponseEntity<Client> save(){
        Client client = Client.builder()
                .name("Semih")
                .lastname("Biygit")
                .address("İstanbul")
                .email("semihbiygit@gmail.com")
                .build();
        clientService.save(client);
        return ResponseEntity.ok(client);
    }
}
