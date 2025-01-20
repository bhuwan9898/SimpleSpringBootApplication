package com.developer.SimpleWebApplication.service;

import com.developer.SimpleWebApplication.model.Product;
import com.developer.SimpleWebApplication.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    //using datajpa and post gres driver to bring data to the server
    @Autowired
    ProductRepo productRepo;
    public List<Product> getProducts(){
        List<Product> allProducts = productRepo.findAll();
        return productRepo.findAll();

    }
    public Product getProductById(int prodId) {

        return productRepo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);

    }

    public void deleteProduct(int prodId) {
        productRepo.deleteById(prodId);
    }
}
