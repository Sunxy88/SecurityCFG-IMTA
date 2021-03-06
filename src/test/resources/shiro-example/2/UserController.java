package example.controller;

import example.vo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @RequestMapping(value = "/subLogin",method = RequestMethod.POST,
            produces = "application/json;charset=utf-8")
    @ResponseBody
    public String subLogin(User user){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken taken = new UsernamePasswordToken(user.getUsername(),user.getPassword());

        try {
            subject.login(taken);
        } catch (AuthenticationException e) {
            System.out.println(user.getUsername()+":"+user.getPassword());
            //e.printStackTrace();
            return e.getMessage();
        }

        if (subject.hasRole("admin")){
            return "Successfully Login with the role of admin";
        }

        return "Successfully login without the role of admin";

    }
}