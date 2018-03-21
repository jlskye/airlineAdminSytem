package com.example.mybatisdemo.controller;


import com.example.mybatisdemo.entity.Carrier;
import com.example.mybatisdemo.service.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("Carrier/")
public class CarrierController {
    @Autowired
    private CarrierService carrierService;
    @RequestMapping("/insert")
    public String insert(HttpServletRequest request, Carrier carrier){
        System.out.println(carrier.getCname());
        System.out.println(carrier.getPicpath());
        try {

            //直接new一个CommonsMultipartResolver
            CommonsMultipartResolver cmr = new CommonsMultipartResolver(request.getServletContext());
            cmr.setDefaultEncoding("utf-8");
            cmr.setMaxInMemorySize(40960);
            cmr.setMaxUploadSize(10485760000L);
            if (cmr.isMultipart(request)) {
                MultipartHttpServletRequest multipartRequest = cmr.resolveMultipart(request);

                // file 是指 文件上传标签的 name=值
                // 根据 name 获取上传的文件...
                MultipartFile file = multipartRequest.getFile("file");
                //上传后记录的文件...
                File imageDir= new File("images/");
                if(!imageDir.exists())
                    imageDir.mkdirs();
                //上传...
                file.transferTo(imageDir);
                String filename = file.getOriginalFilename();
                System.out.println("filename"+filename);
                carrier.setPicpath(filename);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        carrierService.insert(carrier);
        return "redirect:/carrierList";
    }
    @RequestMapping("/updateById")
    public String updateById(Carrier carrier){
//        System.out.println(air.getId()+air.getCabin()+air.getDescription());
        carrierService.updateById(carrier);
        return "redirect:/carrierList";
    }
    @RequestMapping("/carrierList")
    public ModelAndView carrierList(ModelAndView mv){
        List<Carrier> carrierList = carrierService.findAll();
        mv.addObject("carrierList",carrierList);
        mv.setViewName("carrierList");
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
            carrierService.deleteById(arr[i]);
        }
        return "redirect:/carrierList";
    }
}
