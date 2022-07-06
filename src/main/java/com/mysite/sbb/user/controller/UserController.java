package com.mysite.sbb.user.controller;

import com.mysite.sbb.user.dao.UserRepository;
import com.mysite.sbb.user.domain.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("")
    @ResponseBody
    public List<user> showUser() {
        return userRepository.findAll();
    }
}
