package com.shubhada.productservice.controllers;

import com.shubhada.productservice.dtos.ProductDTO;
import com.shubhada.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    //inversion of control
    private ProductService productService;
    public ProductController(ProductService productService){
     this.productService=productService;
    }
    @GetMapping("")
    public String getAllProducts(){
        return "Getting All Products";
    }
    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId){
        return "Returning Single Product with id: "+productId;
    }
    @PostMapping("")
    public String addNewProduct(@RequestBody ProductDTO productDTO){
        return "Adding New Product with "+productDTO;
    }
    //assignment take requestBody
    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId,@RequestBody ProductDTO productDTO){
        return "Updating a Product with id: "+productId +" and with data: "+productDTO;
    }
    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId){
        return "Deleting a Product with id: "+productId;
    }
}
