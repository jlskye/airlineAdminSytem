package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.flightInfo;
import com.example.mybatisdemo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("Flight/")
public class FlightController {

    @Autowired
    private FlightService FlightService;

    @RequestMapping("/flight-info")
    public ModelAndView flight_info(){
        ModelAndView flight_mv = new ModelAndView();
        List<flightInfo> flightInfoList = FlightService.findALLFlight();
        Integer flightNum = flightInfoList.size();
        System.out.print(flightInfoList.get(0).getArrCity());
        flight_mv.addObject("flightInfo",flightInfoList);
        flight_mv.addObject("flightNum",flightNum);
        flight_mv.setViewName("flight-info");
        return flight_mv;
    }

    // 跳转到添加用户页面(get请求)
    // 访问方法: http://localhost/springmvc_user/user/add
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@ModelAttribute("flightInfo") flightInfo flightInfo) {
        return "flight-add";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Validated flightInfo flightInfo, BindingResult br) throws IOException { // @Validated: 对User数据进行校验
        if (br.hasErrors()) {
            return "Flight/add"; // 如果有错误, 则直接跳转到add添加用户页面
        }
        FlightService.insert(flightInfo);
        return "redirect:/Flight/flight-info"; // 重定向到用户列表页面
    }


    @RequestMapping(value="/{flightID}/update", method= RequestMethod.GET)
    public String update(@PathVariable String flightID, Model model) { // @PathVariable: 路径里面的值作为参数
        Integer id = Integer.parseInt(flightID);
        model.addAttribute(FlightService.findFlight(id)); // 等同: model.addAttribute("user", userMap.get(username));
        return "flight-update";
    }

    // 具体的修改用户处理方法(post请求)
    // 注意: BindingResult必须在User之后, 中间不能有其他的参数
    @RequestMapping(value="/{flightID}/update", method= RequestMethod.POST)
    public String update(@PathVariable String flightID, @Validated flightInfo flightInfo, BindingResult br) {
        if(br.hasErrors()) {
            return "Flight/update"; // 如果有错误, 则直接跳转到update修改用户页面
        }
        Integer id = Integer.parseInt(flightID);
        FlightService.updateById(flightInfo);
        return "redirect:/Flight/flight-info";
    }

    @RequestMapping("/insert")
    public String insert(flightInfo flight){
        FlightService.insert(flight);
        return "redirect:/Flight/flight-info";
    }

    @RequestMapping(value="/{flightID}/delete",method= RequestMethod.GET)
    public String delete(@PathVariable String flightID){
        System.out.print(flightID);
        Integer id = Integer.parseInt(flightID);
        System.out.print(id);
        FlightService.deleteById(id);
        return "redirect:/Flight/flight-info";

    }



}
