package com.example.mybatisdemo.service.impl;

import com.example.mybatisdemo.entity.*;
import com.example.mybatisdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

        @Autowired
        private com.example.mybatisdemo.mapper.OrderMapper OrderMapper;


        public List<orderInfo> findALLOrder(){
            Integer orderId = 14;//指定id 从14开始
            String Phone;
            List<orderInfo> orderInfoList = new ArrayList<orderInfo>();
            for(;OrderMapper.findMOrder(orderId)!=null;orderId ++){
                mainorderInfo mainOrder = OrderMapper.findMOrder(orderId);
                orderInfo order = new orderInfo();
                Phone = mainOrder.getUserPhone();
                order.setUserPhone(Phone);
                order.setOrderType(mainOrder.getOrderType());
                if(mainOrder.getOrderType() == 1){

                    sgorderInfo orderInfo = new sgorderInfo();
                    flightInfo flightInfo = new flightInfo();
                    flightUniInfo flightUniInfo = new flightUniInfo();
                    carrierInfo carrierInfo = new carrierInfo();
                    psgInfo psgInfo = new psgInfo();


                    orderInfo = OrderMapper.findSOrder(orderId);
                    flightInfo = OrderMapper.findFlight(orderInfo.getFlightID());
                    flightUniInfo = OrderMapper.findUniFlight(orderInfo.getFlightID());
                    carrierInfo = OrderMapper.carrierInfo(flightInfo.getCarrierID());
                    psgInfo = OrderMapper.psgInfo(orderId);

                    order.setOrderID(orderId);

                    order.setOrderType(OrderMapper.findMOrder(orderId).getOrderType());


                    order.setFlightID(orderInfo.getOrderID());


                    order.setFlight_no(flightInfo.getFlightNo());

                    order.setArrCity(flightInfo.getArrCity());
                    order.setDepCity(flightInfo.getDepCity());

                    order.setDep_date(flightUniInfo.getDepDate());
                    order.setArr_date(flightUniInfo.getArrDate());

                    order.setDepTime(flightInfo.getDepTime());
                    order.setArrTime(flightInfo.getArrTime());

                    order.setCarrierId(flightInfo.getCarrierID());
                    order.setCarrierName(carrierInfo.getCarrierName());

                    order.setPsg_name(psgInfo.getPsg_name());
                    order.setPsg_type(psgInfo.getPsg_type());
                }
                else if(mainOrder.getOrderType() == 2){


                    retnorderInfo orderInfo_1 = new retnorderInfo();
                    retnorderInfo orderInfo_2 = new retnorderInfo();
                    flightInfo flightInfo_1 = new flightInfo();
                    flightInfo flightInfo_2 = new flightInfo();
                    carrierInfo carrierInfo_1 = new carrierInfo();
                    carrierInfo carrierInfo_2 = new carrierInfo();
                    psgInfo psgInfo = new psgInfo();


                    orderInfo_1 = OrderMapper.findROrder(orderId,1);
                    orderInfo_2 = OrderMapper.findROrder(orderId,2);

                    flightInfo_1 = OrderMapper.findFlight(orderInfo_1.getFlightID());
                    flightInfo_2 = OrderMapper.findFlight(orderInfo_2.getFlightID());
                    carrierInfo_1 = OrderMapper.carrierInfo(flightInfo_1.getCarrierID());
                    carrierInfo_2 = OrderMapper.carrierInfo(flightInfo_2.getCarrierID());
                    psgInfo = OrderMapper.psgInfo(orderId);

                    order.setOrderID(orderId);
                    order.setOrderType(OrderMapper.findMOrder(orderId).getOrderType());

                    order.setFlightID(OrderMapper.findROrder(orderId,1).getFlightID());
                    order.setFlightRId(OrderMapper.findROrder(orderId,2).getFlightID());

                    order.setFlight_no(OrderMapper.findFlight(order.getFlightid()).getFlightNo());
                    System.out.print(order.getFlight_no());
                    String no = OrderMapper.findFlight(order.getFlightRId()).getFlightNo();
                    System.out.print(order.getFlight_no());
                    System.out.print(no);
                    order.setFlight_no(no);

                    order.setArrCity(OrderMapper.findFlight(order.getFlightid()).getArrCity());
                    order.setArrCity(OrderMapper.findFlight(order.getFlightRId()).getArrCity());
                    order.setDepCity(OrderMapper.findFlight(order.getFlightid()).getDepCity());
                    order.setDepCity(OrderMapper.findFlight(order.getFlightRId()).getDepCity());

                    order.setDep_date(OrderMapper.findUniFlight(order.getFlightid()).getDepDate());
                    order.setDep_date(OrderMapper.findUniFlight(order.getFlightRId()).getDepDate());
                    order.setArr_date(OrderMapper.findUniFlight(order.getFlightid()).getArrDate());
                    order.setArr_date(OrderMapper.findUniFlight(order.getFlightRId()).getArrDate());

                    order.setDepTime(OrderMapper.findFlight(order.getFlightid()).getDepTime());
                    order.setDepTime(OrderMapper.findFlight(order.getFlightid()).getDepTime());
                    order.setArrTime(OrderMapper.findFlight(order.getFlightid()).getArrTime());
                    order.setArrTime(OrderMapper.findFlight(order.getFlightid()).getArrTime());

                    order.setCarrierId(flightInfo_1.getCarrierID());
                    order.setCarrierId(flightInfo_2.getCarrierID());
                    order.setCarrierName(carrierInfo_1.getCarrierName());
                    order.setCarrierName(carrierInfo_2.getCarrierName());

                    order.setPsg_name(psgInfo.getPsg_name());
                    order.setPsg_type(psgInfo.getPsg_type());
                }
                orderInfoList.add(order);
            }
            return orderInfoList;
        }

        public void delOrder(Integer id){
            OrderMapper.delMOrder(id);
            OrderMapper.delPsg(id);
            OrderMapper.delROrder(id);
            OrderMapper.delROrder(id);
        }
        public mainorderInfo findMOrder(Integer id) {
            return findMOrder(id);
        }
        public sgorderInfo findSOrder(Integer id){
            return  OrderMapper.findSOrder(id);
        }
        public retnorderInfo findROrder(Integer id, Integer code){
            return OrderMapper.findROrder(id,code);
        }
        public flightInfo findFlight(Integer flightID){
            return findFlight(flightID);
        }
        public flightUniInfo findUniFlight(Integer flightID){
            return  findUniFlight(flightID);
        }
        public carrierInfo carrierInfo(String carrierID){
            return  carrierInfo(carrierID);
        }
        public psgInfo psgInfo(Integer orderID){
            return psgInfo(orderID);
        }

        public void delMOrder(Integer id){
            OrderMapper.delMOrder(id);
        };
        public void delSOrder(Integer id){
            OrderMapper.delSOrder(id);
        };
        public void delROrder(Integer id){
            OrderMapper.delROrder(id);
        };
        public void delPsg(Integer id){
            OrderMapper.delPsg(id);
        }
        }

