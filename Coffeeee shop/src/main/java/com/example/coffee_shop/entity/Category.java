package com.example.coffee_shop.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String Name;

      public Category() {

      }
      public Category(
              String Name) {
          super();
          this.Name= Name;
      }
}