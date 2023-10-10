package com.shubhada.productservice.controllers;

import com.shubhada.productservice.services.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/categories")

public class CategoryController {
    private  CategoryService categoryService;
    public CategoryController(CategoryService categoryService){

        this.categoryService=categoryService;
    }
    @GetMapping("")
    public String getAllCategories(){
        return "Getting All Categories";
    }
    @GetMapping("/{category}")
    public String getProductsInCategory(@PathVariable("category") String category){
        return "Getting Products In Category is: "+category;
    }
}
