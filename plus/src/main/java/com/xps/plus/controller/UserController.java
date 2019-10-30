package com.xps.plus.controller;

import com.xps.plus.entity.User;
import com.xps.plus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/login.do")
    public String toLogin(){

        return "login";
    }
    @PostMapping("/login.do")
    public String login(String userName, String password,
                        HttpSession session,Model model){
        User user = userService.login(userName,password);
        if(user != null){
            session.setAttribute("user",user);
            model.addAttribute("user",user);
            return "index";
        }
        return "login";
    }
}
