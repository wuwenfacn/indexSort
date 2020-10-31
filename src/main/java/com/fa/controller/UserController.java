package com.fa.controller;

import com.fa.entity.User;
import com.fa.service.UserService;
import com.fa.utils.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static jdk.nashorn.tools.Shell.SUCCESS;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;
    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<User>> select(){
        List<User> users = userService.selectUserList();
        return ResponseEntity.success(users);
    }
}
