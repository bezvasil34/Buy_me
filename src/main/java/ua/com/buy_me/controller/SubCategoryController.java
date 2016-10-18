package ua.com.buy_me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.buy_me.entity.Category;
import ua.com.buy_me.entity.SubCategory;
import ua.com.buy_me.service.CategoryService;
import ua.com.buy_me.service.SubCategoryService;

/**
 * Created by koko on 16.10.16.
 */
@Controller
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/subCategory", method = RequestMethod.GET)
    public String subCategory(Model model){
        model.addAttribute("subCategories", subCategoryService.findAllfetch());
        model.addAttribute("categories", categoryService.findAll());
        return "subCategory";
    }

    @RequestMapping(value = "/newSubCategory", method = RequestMethod.POST)
    public String newSubCategory(@RequestParam String name, @RequestParam String categoryID){
        SubCategory subCategory = new SubCategory(name);
        subCategory.setCategory(categoryService.findOne(Integer.parseInt(categoryID)));
        subCategoryService.save(subCategory);
        return "redirect:/subCategory";
    }

    @RequestMapping(value = "/deleteSubCategory/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable String id){
        subCategoryService.delete(Integer.parseInt(id));
        return "redirect:/subCategory";
    }



}
