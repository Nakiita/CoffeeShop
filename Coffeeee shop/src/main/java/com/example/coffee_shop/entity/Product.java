package com.example.coffee_shop.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Data
@Table(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Name",
            nullable = false)
    private String Name;

    @Column(name = "Preview")
    private String Preview;

    @Column(name = "image")
    private String imageUrl;

    public Product() {

    }
    public Product(String Name, String Preview, String image) {
        super();
        this.Name = Name;
        this.Preview = Preview;
    }
}