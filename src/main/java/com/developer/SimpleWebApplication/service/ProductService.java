package com.developer.SimpleWebApplication.service;

import com.developer.SimpleWebApplication.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    //this is a temporary database
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "MacBook", 5000, 2022),
             new Product(102, "Dell Monitor", 300, 2023),
             new Product(103, "Apple Watch", 150, 2019),
             new Product(104, "Vision Pro", 6000, 2024)

    ));
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream().filter(p->p.getProdId()==prodId).findFirst().get();//using stream api to filter out the products and return the one that matches with the id
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int i = 0;i<products.size();i++){
            if(products.get(i).getProdId()==product.getProdId()){
                index = i;
            }
        }
        products.set(index,product);
    }

    public void deleteProduct(int prodId) {
        products.remove(products.stream().filter(p->p.getProdId()==prodId).findFirst().get());
    }
}
