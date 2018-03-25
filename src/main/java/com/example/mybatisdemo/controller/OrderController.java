package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.orderInfo;
import com.example.mybatisdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("Order/")
public class OrderController {

    @Autowired
    private OrderService OrderSevice;

    @RequestMapping("/order-info")
    public ModelAndView order_info(){
        ModelAndView order_mv=new ModelAndView();
        List<orderInfo> orders = OrderSevice.findALLOrder();
        Integer orderNum = orders.size();
        order_mv.addObject("orderInfo",orders);
        order_mv.addObject("orderNum",orderNum);
        order_mv.setViewName("order-info");
        return order_mv;
    }

    @RequestMapping(value="/{orderID}/delete",method= RequestMethod.GET)
    public String delete(@PathVariable String orderID){
        System.out.print(orderID);
        Integer id = Integer.parseInt(orderID);
        System.out.print(id);
        OrderSevice.delOrder(id);
        return "redirect:/Flight/flight-info";
    }
}
