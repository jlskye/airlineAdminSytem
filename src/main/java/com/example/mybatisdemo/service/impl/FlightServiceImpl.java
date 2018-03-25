package com.example.mybatisdemo.service.impl;

import com.example.mybatisdemo.entity.flightInfo;
import com.example.mybatisdemo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService{
    @Autowired
    private com.example.mybatisdemo.mapper.FlightMapper FlightMapper;

    public List<flightInfo> findALLFlight(){
        return FlightMapper.findALLFlight();
    }
    public flightInfo findFlight(Integer flightID){
        return FlightMapper.findFlight(flightID);
    }
    public void insert(flightInfo flight){
        System.out.print("进入插入函数");
        FlightMapper.insert(flight);
    }
    public void deleteById(int flight_id){
        FlightMapper.deleteById(flight_id);
    }
    public void updateById(flightInfo flightInfo){
        System.out.print("进入更新函数");
        FlightMapper.updateById(flightInfo);
    }
}
