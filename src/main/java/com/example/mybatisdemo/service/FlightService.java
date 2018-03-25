package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.flightInfo;

import java.util.List;

public interface FlightService {

    List<flightInfo> findALLFlight();
    flightInfo findFlight(Integer flightID);
    void insert(flightInfo flight);
    void deleteById(int flight_id);
    void updateById(flightInfo flightInfo);


}
