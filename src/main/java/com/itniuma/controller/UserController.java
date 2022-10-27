package com.itniuma.controller;

import com.itniuma.pojo.User;
import com.itniuma.service.serviceImp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserServiceImp userService;
    //查找所有联系人发送到首页
    @RequestMapping("selectAllUser")
    public String selectAll(Model model){
        List<User> users = userService.selectAll();
        model.addAttribute("users",users);
        return "user";
    }

    @RequestMapping("selectBySingleInfo")
    public String selectBySingleInfo(String userName,Model model){
        List<User> users = userService.selectBySingleInfo(userName);
        model.addAttribute("users",users);
        return "user";
    }
    @RequestMapping("insertUser")
    public String insertUser(){
        return "insertUser";
    }
    @RequestMapping("addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/user/selectAllUser";
    }

    @RequestMapping("deleteById")
    public String deleteUser(User user){
        userService.delete(user.getId());
        return "redirect:/user/selectAllUser";
    }
    @RequestMapping("findUser")
    public String findUser(Integer id,Model model){
        User user = userService.selectById(id);
        model.addAttribute("findUser",user);
        return "update";
    }
    @RequestMapping("updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/user/selectAllUser";
    }
    @RequestMapping("findUserForDelete")
    public String findUserForDelete(Integer id,Model model){
        User user = userService.selectById(id);
        model.addAttribute("findUser",user);
        return "delete";
    }
}
