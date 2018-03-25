package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.*;

import java.util.List;

public interface OrderService {

    List<orderInfo> findALLOrder();

    mainorderInfo findMOrder(Integer id);     //查看单个main航班信息

    sgorderInfo findSOrder(Integer id);

    retnorderInfo findROrder(Integer id, Integer code);

    flightInfo findFlight(Integer flightID);

    flightUniInfo findUniFlight(Integer flightID);

    carrierInfo carrierInfo(String carrierID);

    psgInfo psgInfo(Integer orderID);

    void delMOrder(Integer id);

    void delSOrder(Integer id);

    void delROrder(Integer id);

    void delPsg(Integer id);

    void delOrder(Integer id);

}
