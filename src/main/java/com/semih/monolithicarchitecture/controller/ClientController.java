package com.semih.monolithicarchitecture.controller;

import com.semih.monolithicarchitecture.repository.entity.Client;
import com.semih.monolithicarchitecture.services.ClientService;
import com.semih.monolithicarchitecture.utils.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.semih.monolithicarchitecture.constants.Urls.*;

@RestController
@RequestMapping(VERSION + API + CLIENT)
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping(SAVE_ALL)
    public ResponseEntity<Void> saveall() {
        try {
            clientService.saveAll(new Datas().getClientList());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Client>> findall() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping(GET_ALL_BY_ADDRESS)
    public ResponseEntity<List<Client>> findAllByAddress() {
        String address = "Bursa";
        return ResponseEntity.ok(clientService.findAllByAddress(address));
    }

    @GetMapping(GET_ALL_BY_NAME)
    public ResponseEntity<List<Client>> findAllByNameLike() {
        String name = "T%";
        return ResponseEntity.ok(clientService.findAllByNameLike(name));
    }

    @GetMapping(GET_ALL_BY_NAME_AND_ADDRESS)
    public ResponseEntity<List<Client>> findByNameStartsWithAndAddressStartsWith() {
        String name = "T";
        String address = "İ";
        return ResponseEntity.ok(clientService.findByNameStartsWithAndAddressStartsWith(name, address));
    }

    @GetMapping(GET_ALL_BY_CREATED_DATE)
    public ResponseEntity<List<Client>> findAllByCreatedDateGreaterThan() {
        Long createdDate = 1662584400000L; // 08.09.2022 00:00:00
        return ResponseEntity.ok(clientService.findAllByCreatedDateGreaterThan(createdDate));
    }

    @GetMapping(GET_OPTIONAL_BY_NAME)
    public ResponseEntity<Client> findTopOptionalByName() {
        String name = "Semih";
        return ResponseEntity.ok(clientService.findTopOptionalByName(name).get());
    }

    @GetMapping("/getallbycreateddatebetween")
    public ResponseEntity<List<Client>> findAllByCreatedDateBetween() {
        Long startDate = 1662066000000L; // 08.09.2022 00:00:00
        Long endDate = 1662584400000L; // 08.09.2022 00:00:00
        return ResponseEntity.ok(clientService.findAllByCreatedDateBetween(startDate, endDate));
    }
}
