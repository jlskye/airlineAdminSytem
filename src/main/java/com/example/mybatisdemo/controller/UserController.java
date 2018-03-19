package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;



@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public  ModelAndView signIn(String acount, String pwd){
		ModelAndView mv=new ModelAndView();
		User user = userService.findByAcount(acount);
		if(user==null){
			System.out.print("user is null");
		}
		if(user != null && user.getPwd().equals(pwd)) {
			mv.addObject("user",user);
			mv.setViewName("home");
			System.out.print("登录成功");
		}else {
			System.out.print("账户或者密码错误");

			mv.addObject("done","账户或者密码不错误");
			mv.setViewName("index");
		}
		return mv;
	}
	@RequestMapping("/users")
	public ModelAndView users(ModelAndView mv) {
		List<User> users = userService.findAll();
		mv.addObject("users", users);
		mv.setViewName("users");
		return mv;
	}



	@RequestMapping("/input")
	public String input() {
		return "input";
	}

    @RequestMapping("/order-info")
    public  ModelAndView order_info(){
        ModelAndView order_mv=new ModelAndView();
        order_mv.setViewName("order-info");
        return order_mv;
    }
	@RequestMapping("/save")
	public String save(User user) {
		userService.save(user);
		return "redirect:/users";
	}
}
