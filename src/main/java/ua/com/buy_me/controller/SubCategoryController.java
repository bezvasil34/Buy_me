package ua.com.buy_me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
        model.addAttribute("subCategory", new SubCategory());
        model.addAttribute("subCategories", subCategoryService.findAllfetch());
        model.addAttribute("categories", categoryService.findAll());
        return "subCategory";
    }

    @RequestMapping(value = "/newSubCategory", method = RequestMethod.POST)
    public String newSubCategory(@ModelAttribute SubCategory subCategory,
                                 @RequestParam String categoryID){
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
