package com.developer.SimpleWebApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data; //lombok does the work of creating getters and setters for us

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;  // this one matches exactly so no @Column needed
    private int buildYear;
}