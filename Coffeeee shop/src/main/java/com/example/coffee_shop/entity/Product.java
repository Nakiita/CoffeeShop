package com.example.coffee_shop.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public Product(String Name, String Preview, String image) {
        super();
        this.Name = Name;
        this.Preview = Preview;
    }
}