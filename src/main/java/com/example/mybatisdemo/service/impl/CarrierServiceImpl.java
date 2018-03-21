package com.example.mybatisdemo.service.impl;

import com.example.mybatisdemo.entity.Carrier;
import com.example.mybatisdemo.mapper.CarrierMapper;
import com.example.mybatisdemo.service.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarrierServiceImpl implements CarrierService {
    @Autowired
    private CarrierMapper carrierMapper;
    public List<Carrier> findAll(){
        return carrierMapper.findAll();
    }
    public void insert(Carrier carrier){
        carrierMapper.insert(carrier);
    }
    public void deleteById(int id){
        carrierMapper.deleteById(id);
    }
    public void updateById(Carrier carrier){
        carrierMapper.updateById(carrier);
    }
}