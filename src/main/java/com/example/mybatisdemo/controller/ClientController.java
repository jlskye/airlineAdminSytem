package com.example.mybatisdemo.controller;


import com.example.mybatisdemo.entity.Client;
import com.example.mybatisdemo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("Client/")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @RequestMapping("/updateById")
    public String updateById(Client client){
//        System.out.println(client.getId()+client.getUname()+client.getIdNumber());
        clientService.updateById(client);
        return "redirect:/clientList";
    }
    @RequestMapping("/insert")
    public String insert(Client client){
        clientService.insert(client);
        return "redirect:/clientList";
    }

    @RequestMapping("/clientList")
    public ModelAndView clientList(ModelAndView mv){
        List<Client> clientList = clientService.findAll();
        mv.addObject("clientList",clientList);
        mv.setViewName("clientList");
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
            clientService.deleteById(arr[i]);
        }
        return "redirect:/clientList";
    }
}
