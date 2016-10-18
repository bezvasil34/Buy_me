package ua.com.buy_me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.buy_me.entity.Commodity;
import ua.com.buy_me.entity.SubCategory;
import ua.com.buy_me.service.CommodityService;
import ua.com.buy_me.service.CountryService;
import ua.com.buy_me.service.SubCategoryService;

/**
 * Created by koko on 16.10.16.
 */
@Controller
public class CommodityController {

    @Autowired
    private CommodityService commodityService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private SubCategoryService subCategoryService;

    @RequestMapping(value = "/commodity", method = RequestMethod.GET)
    public String commodity(Model model){
        model.addAttribute("commodities", commodityService.findAll());
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("subcategories", subCategoryService.findAll());
        return "commodity";
    }

    @RequestMapping(value = "/newCommodity", method = RequestMethod.POST)
    public String newCommodity(@RequestParam String name, @RequestParam String description,
                               @RequestParam String price, @RequestParam String subCategoryID,
                               @RequestParam String countryID){

        Commodity commodity = new Commodity(name, description, Double.parseDouble(price));
        commodity.setSubCategory(subCategoryService.findOne(Integer.parseInt(subCategoryID)));
        commodity.setCountry(countryService.findOne(Integer.parseInt(countryID)));

        commodityService.save(commodity);
        return "redirect:/commodity";
    }


}
