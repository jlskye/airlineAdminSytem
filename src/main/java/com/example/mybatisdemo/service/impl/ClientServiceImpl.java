package com.example.mybatisdemo.service.impl;

import com.example.mybatisdemo.entity.Client;
import com.example.mybatisdemo.mapper.ClientMapper;
import com.example.mybatisdemo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientMapper clientMapper;
   public List<Client> findAll(){
        return clientMapper.findAll();
    }
    public void insert(Client client){
        clientMapper.insert(client);
    }
    public void deleteById(int id){
        clientMapper.deleteById(id);
    }
}
