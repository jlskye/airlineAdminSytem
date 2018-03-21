package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.Carrier;

import java.util.List;

public interface CarrierService {
    List<Carrier> findAll();
    void insert(Carrier carrier);
    void deleteById(int id);
    void updateById(Carrier carrier);

}

