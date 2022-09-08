package com.semih.monolithicarchitecture.utils;

import com.semih.monolithicarchitecture.repository.entity.Client;

import java.util.ArrayList;
import java.util.List;

public class Datas {
    private List<Client> clientList;

    public List<Client> getClientList() {
        clientList = new ArrayList<>();
        clientList.add(Client.builder()
                .name("Tugce")
                .lastname("Yakup")
                .phone("123456789")
                .createdDate(1662642862000L) //
                .address("İstanbul")
                .email("tugceyakup@gmail.com").build());
        clientList.add(Client.builder()
                .name("Semih")
                .lastname("Biygit")
                .phone("123456789")
                .createdDate(1662642862000L)
                .address("Bursa")
                .email("semihbiygit@gmail.com").build());
        clientList.add(Client.builder()
                .name("Ahmet")
                .lastname("Mehmet")
                .phone("123123459")
                .createdDate(1662297262000L)
                .address("Erzincan")
                .email("ahmetmehmet@gmail.com").build());
        clientList.add(Client.builder()
                .name("Fatma")
                .lastname("Hayriye")
                .phone("121212312")
                .createdDate(1662210862000L)
                .address("Zonguldak")
                .email("fatmahayriye@gmail.com").build());
        clientList.add(Client.builder()
                .name("Mustafa")
                .lastname("Fatih")
                .phone("123456789")
                .createdDate(1662210862000L)
                .address("İstanbul")
                .email("fatihmustafa@gmail.com").build());
        clientList.add(Client.builder()
                .name("Tuana")
                .lastname("Fatih")
                .phone("123456789")
                .createdDate(1662038062000L)
                .address("İstanbul")
                .email("tuana@gmail.com").build());
        return clientList;
    }
}
