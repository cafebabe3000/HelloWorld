package com.test.controller;

import com.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/5/17.
 */
@Controller
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUser(Model model) {
        System.out.println(userService.selectAll().size());
        model.addAttribute("user", userService.selectAll());
        return "listUser";
    }
}
