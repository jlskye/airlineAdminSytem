package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.adminInfo;
import com.example.mybatisdemo.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("System/")
public class SystemController {
    @Autowired
    private SystemService SystemService;

    @RequestMapping("/system-info")
    public ModelAndView system_info(){
        ModelAndView system_mv = new ModelAndView();
        List<adminInfo> admins = SystemService.findAllAdmin();
        Integer adminNum = admins.size();
        system_mv.addObject("adminList",admins);
        system_mv.addObject("adminNum",adminNum);
        system_mv.setViewName("system-info");
        return system_mv;
    }
    @RequestMapping(value="/{adminID}/update", method= RequestMethod.GET)
    public String update(@PathVariable String adminID, Model model) { // @PathVariable: 路径里面的值作为参数
        Integer id = Integer.parseInt(adminID);
        model.addAttribute(SystemService.findAdmin(id)); // 等同: model.addAttribute("user", userMap.get(username));
        return "system-update";
    }

    // 具体的修改用户处理方法(post请求)
    // 注意: BindingResult必须在User之后, 中间不能有其他的参数
    @RequestMapping(value="/{adminID}/update", method= RequestMethod.POST)
    public String update(@PathVariable String adminID, @Validated adminInfo adminInfo, BindingResult br) {
        if(br.hasErrors()) {
            return "System/update"; // 如果有错误, 则直接跳转到update修改用户页面
        }
        Integer id = Integer.parseInt(adminID);
        SystemService.updateById(adminInfo);
        return "redirect:/System/system-info";
    }
    @RequestMapping(value="/{adminID}/delete",method= RequestMethod.GET)
    public String delete(@PathVariable String adminID){
        System.out.print(adminID);
        Integer id = Integer.parseInt(adminID);
        System.out.print(id);
        SystemService.deleteById(id);
        return "redirect:/System/system-info";

    }
}
