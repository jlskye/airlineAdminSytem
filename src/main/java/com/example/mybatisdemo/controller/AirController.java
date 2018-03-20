package com.example.mybatisdemo.controller;


import com.example.mybatisdemo.entity.Air;
import com.example.mybatisdemo.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("Air/")
public class AirController {
    @Autowired
    private AirService airService;
    @RequestMapping("/insert")
    public String insert(Air air){
        airService.insert(air);
        return "redirect:/airList";
    }
    @RequestMapping("/updateById")
    public String updateById(Air air){
        System.out.println(air.getId()+air.getCabin()+air.getDescription());
        airService.updateById(air);
        return "redirect:/airList";
    }
    @RequestMapping("/airList")
    public ModelAndView clientList(ModelAndView mv){
        List<Air> airList = airService.findAll();
        mv.addObject("airList",airList);
        mv.setViewName("airList");
        return mv;
    }


    @RequestMapping("/deleteById")
    public  String delete(@RequestParam("id") String idString){
        String[] idString2 = idString.split(",");
//        for(String s : idString2) {
//            System.out.println( Integer.valueOf( s ) );
//        }
        int len = idString2.length;
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = Integer.parseInt(idString2[i]);
            airService.deleteById(arr[i]);
        }
        return "redirect:/airList";
    }
}
