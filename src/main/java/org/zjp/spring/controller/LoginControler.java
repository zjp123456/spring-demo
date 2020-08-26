package org.zjp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zjp.spring.bean.UserBean;
import org.zjp.spring.service.UserService;

@Controller
public class LoginControler {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping(value="/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "index";
        }else {
            return "error";
        }
    }
}
