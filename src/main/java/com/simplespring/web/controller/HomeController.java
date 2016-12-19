package com.simplespring.web.controller;

        import com.simplespring.web.service.IServiceContract.IUserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Eyuel Tadesse on 12/15/2016.
 */
@Controller
public class HomeController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage() {
        return "home";
    }



}
