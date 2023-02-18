package com.example.coffee_shop.controller;

import com.example.coffee_shop.entity.Product;
import com.example.coffee_shop.services.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    ProductService productService;
    //product section
    @GetMapping("/products")
    public String getProduct(Model model){
        model.addAttribute("products",productService.getAllProduct());
        return "products";
    }
    @GetMapping("/products/add")
    public String getproduct(Model model){
        model.addAttribute("product",new Product());
//        model.addAttribute("categories", categoryService.getAllCategory());
        return "productsAdd";
    }

    @PostMapping("/products/add")
    public String postProdAdd(@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "redirect:/admin/products";
    }

    @GetMapping("/products/update/{id}")
    public String UpdateProd(@PathVariable int id, Model model){
        Optional<Product> product=productService.getProductById(id);
        if (product.isPresent()){
            model.addAttribute("product", product.get());
            return "productsAdd";
        }else
            return "404";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProd(@PathVariable int id){
        productService.removeProductById(id);
        return "redirect:/admin/products";
    }


}
