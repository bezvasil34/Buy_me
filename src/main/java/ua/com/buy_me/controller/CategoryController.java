package ua.com.buy_me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.buy_me.entity.Category;
import ua.com.buy_me.service.CategoryService;

/**
 * Created by koko on 16.10.16.
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String category(Model model){

        model.addAttribute("categories", categoryService.findAll());
        return "category";
    }

    @RequestMapping(value = "/newCategory", method = RequestMethod.POST)
    public String newCategory(@RequestParam String name){
        categoryService.save(new Category(name));
        return "redirect:/category";
    }

}
