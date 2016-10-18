package ua.com.buy_me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.buy_me.entity.User;
import ua.com.buy_me.service.UserService;

/**
 * Created by koko on 16.10.16.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(){
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String signUp(@RequestParam String username, @RequestParam String email,
                         @RequestParam String phoneNumber, @RequestParam String password){
        userService.save(new User(username,email,phoneNumber,password));
        return "redirect:/home";
    }

}
