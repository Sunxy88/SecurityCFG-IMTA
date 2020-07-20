package com.xaut.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xaut.entity.User;

@Controller
public class UserController {

    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String toLogin() {

        return "login";
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String userLogin(User user,Model model) {
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassWord());
        try {

            subject.login(token);
        } catch (UnknownAccountException e) {
            model.addAttribute("error", "Account does not exsist");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("error", "Username/password incorrect");
            return "login";
        } catch (LockedAccountException e) {
            model.addAttribute("error", "Account is locked");
            return "login";
        } catch (Exception e) {
            model.addAttribute("error", "Something wrong");
            return "login";
        }

        if(subject.hasRole("admin") || subject.hasRole("superadmin")) {
            return "admin/index";
        } else if(subject.hasRole("student")) {
            return "student/index";
        } else if(subject.hasRole("teacher")) {
            return "teacher/index";
        }
        return "redirect:nopermission.jsp";
    }

    @RequestMapping(value="/add")
    @ResponseBody
    public String add() throws  Exception{
        return "add users";
    }

    @RequestMapping(value="/delete",method=RequestMethod.GET)
    @RequiresPermissions(value="users:delete")
    @ResponseBody
    public String delete() throws  Exception{
        return "delete users";
    }
    Mapping(value="/logout",method=RequestMethod.GET)
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout();
        }
        System.out.println("Sign out");
        return "login";
    }
}