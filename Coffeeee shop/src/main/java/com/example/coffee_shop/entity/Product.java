package com.example.coffee_shop.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ProductName",
            nullable = false)
    private String ProductName;

    @Column(name = "Category")
    private String Category;

    @Column(name = "Preview")
    private String Preview;

    public Product() {

    }
    public Product(String ProductName, String Category, String Preview) {
        super();
        this.ProductName = ProductName;
        this.Category = Category;
        this.Preview = Preview;
    }
}