package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
    void insert(Client client);
    void deleteById(int id);
    void updateById(Client client);

}

