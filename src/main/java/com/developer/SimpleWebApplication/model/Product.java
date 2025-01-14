package com.developer.SimpleWebApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data; //lombok does the work of creating getters and setters for us

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int price;
    private int buildYear;
}
