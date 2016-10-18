package ua.com.buy_me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.buy_me.service.CommodityService;

/**
 * Created by koko on 14.10.16.
 */
@Controller
public class HomeController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("commodities", commodityService.findAll());
        return "home";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(){
        return "admin";
    }

}
