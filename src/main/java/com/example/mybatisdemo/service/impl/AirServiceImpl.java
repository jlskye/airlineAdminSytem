package com.example.mybatisdemo.service.impl;

import com.example.mybatisdemo.entity.Air;
import com.example.mybatisdemo.mapper.AirMapper;
import com.example.mybatisdemo.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AirServiceImpl implements AirService {
    @Autowired
    private AirMapper airMapper;
    public List<Air> findAll(){
        return airMapper.findAll();
    }
    public void insert(Air air){
        airMapper.insert(air);
    }
    public void deleteById(int id){
        airMapper.deleteById(id);
    }
    public void updateById(Air air){
        airMapper.updateById(air);
    }
}