package com.developer.SimpleWebApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data; //lombok does the work of creating getters and setters for us

@Data
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
    private int buildYear;
}
