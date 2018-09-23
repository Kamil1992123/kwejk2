package pl.akademiakodu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.data.CategoryRepository;
import pl.akademiakodu.model.Category;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {


    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap){
        List<Category> categories = categoryRepository.getAllCategories();

        modelMap.put("categories",categories);

        return "categories";
    }


        }
