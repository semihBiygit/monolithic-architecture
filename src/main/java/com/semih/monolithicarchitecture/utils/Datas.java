package com.semih.monolithicarchitecture.utils;

import com.semih.monolithicarchitecture.repository.entity.Client;
import com.semih.monolithicarchitecture.repository.entity.Product;
import com.semih.monolithicarchitecture.repository.entity.Sales;

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

    public List<Product> productList;

    public List<Product> getProductList() {
        productList = new ArrayList<>();
        productList.add(Product.builder()
                .name("Laptop")
                .price(1000.0)
                .label("Asus")
                .model("X100")
                .stock(10)
                .state(1)
                .createdDate(1662642862000L)
                .build());
        productList.add(Product.builder()
                .name("Mouse")
                .price(50.0)
                .label("SteelSeries")
                .model("Rival 600")
                .stock(10)
                .state(1)
                .createdDate(1662642862000L)
                .build());
        productList.add(Product.builder()
                .name("Keyboard")
                .price(100.0)
                .label("Logitech")
                .model("MX Keys")
                .stock(10)
                .state(1)
                .createdDate(1662642862000L)
                .build());
        productList.add(Product.builder()
                .name("Monitor")
                .price(500.0)
                .label("MSI")
                .model("Optix MAG241C")
                .stock(10)
                .state(1)
                .createdDate(1662642862000L)
                .build());
        productList.add(Product.builder()
                .name("Printer")
                .price(200.0)
                .label("HP")
                .model("LaserJet Pro MFP M28w")
                .stock(10)
                .state(1)
                .createdDate(1662642862000L)
                .build());
        productList.add(Product.builder()
                .name("Scanner")
                .price(300.0)
                .label("Epson")
                .model("Perfection V39")
                .stock(10)
                .state(1)
                .createdDate(1662642862000L)
                .build());
        return productList;

    }

    public List<Sales> salesList;

    public List<Sales> getSalesList() {
        salesList = new ArrayList<>();
        salesList.add(Sales.builder()
                .quantity(1)
                .price(1000.0)
                .clientId(101L)
                .productId(17L)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(100L)
                .productId(15L)
                .quantity(1)
                .price(50.0)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(102L)
                .productId(13L)
                .price(100.0)
                .quantity(1)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(100L)
                .productId(14L)
                .price(500.0)
                .quantity(1)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(100L)
                .productId(15L)
                .quantity(1)
                .price(200.0)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(104L)
                .productId(17L)
                .price(1000.0)
                .quantity(1)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(105L)
                .productId(12L)
                .price(50.0)
                .quantity(1)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(102L)
                .productId(14L)
                .price(100.0)
                .quantity(1)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(102L)
                .productId(14L)
                .quantity(1)
                .price(500.0)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(102L)
                .productId(15L)
                .price(200.0)
                .quantity(1)
                .createdDate(1662642862000L)
                .build());
        salesList.add(Sales.builder()
                .clientId(103L)
                .productId(13L)
                .price(1000.0)
                .quantity(1)
                .createdDate(1662642862000L)
                .build());
        return salesList;
    }
}
