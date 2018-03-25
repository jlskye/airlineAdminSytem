package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class dataController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/deleteorder")
//    public String deleteOrder(Integer orderID){
//        userService.deleteOrder(orderID);
//
//    }

}
