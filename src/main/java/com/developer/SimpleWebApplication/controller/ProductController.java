package com.developer.SimpleWebApplication.controller;

import com.developer.SimpleWebApplication.model.Product;
import com.developer.SimpleWebApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/products") //request mapping annotations can be made more specific using get or post mapping
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }
    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }


}
