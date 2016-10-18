package ua.com.buy_me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.buy_me.entity.Country;
import ua.com.buy_me.service.CountryService;

/**
 * Created by koko on 16.10.16.
 */
@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public String country(){
        return "country";
    }

    @RequestMapping(value = "/newCountry", method = RequestMethod.POST)
    public String newCountry(@RequestParam String name){
        countryService.save(new Country(name));
        return "redirect:/country";
    }


}
