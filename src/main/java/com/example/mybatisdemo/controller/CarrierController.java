package com.example.mybatisdemo.controller;


import com.example.mybatisdemo.entity.Carrier;
import com.example.mybatisdemo.service.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping("Carrier/")
public class CarrierController {
    @Autowired
    private CarrierService carrierService;
    @ResponseBody
    @RequestMapping("/insert")
    public String insert(@ModelAttribute Carrier carrier, HttpServletRequest request)
            throws Exception {

                MultipartFile file = carrier.getUploadfile();
                //上传后记录的文件...
                String filename = file.getOriginalFilename();

                File path= new File(request.getServletContext().getRealPath("/images/")+filename);
                System.out.println("新建目录："+path.getAbsolutePath());

                if(!path.getParentFile().exists())
                    path.getParentFile().mkdirs();
                // 上传的文件写入到指定的文件中
                file.transferTo(path);
                System.out.println("filename"+filename);
                carrier.setPicpath(filename);
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
