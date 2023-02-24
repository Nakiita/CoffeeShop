package com.example.coffee_shop.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Price")
    private String Price;


    @Column(name = "image")
    private String imageUrl;
      public Category(
              String Name, String image) {
          super();
          this.Name= Name;
      }
}