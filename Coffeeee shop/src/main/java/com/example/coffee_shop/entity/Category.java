package com.example.coffee_shop.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Price")
    private String Price;


    @Column(name = "image")
    private String imageUrl;

      public Category() {

      }
      public Category(
              String Name, String image) {
          super();
          this.Name= Name;
      }
}