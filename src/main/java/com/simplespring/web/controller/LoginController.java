package com.simplespring.web.controller;

import com.simplespring.web.service.IServiceContract.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Eyuel Tadesse on 12/16/2016.
 */
@Controller
public class LoginController  {
    @Autowired
    ILoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin() {
        return "login";
    }
}
