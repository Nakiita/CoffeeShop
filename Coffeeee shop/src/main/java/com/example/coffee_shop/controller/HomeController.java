
package com.example.coffee_shop.controller;

import com.example.coffee_shop.entity.Product;
import com.example.coffee_shop.services.UserService;
import com.example.coffee_shop.services.impl.CategoryService;
import com.example.coffee_shop.services.impl.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class HomeController {
    private final UserService userService;
    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/coffee_shop";
//    public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/Images";
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/shopNow")
    public String shopNow(Model model){
        model.addAttribute("products",productService.getAllProduct());
        return "UserProduct";
    }
    @PostMapping("/shopNow")
    public String postProdAdd(@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "redirect:/user/shopNow";
    }
    @GetMapping("/userHome/menu")
    public String menu(Model model){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products",productService.getAllProduct());
        return "menu";
    }
    @GetMapping("/userHome/contact")
    public String contact(Model model){
        return "contact";
    }


//    @GetMapping("/user/userHome/menu/category/{id]")
//    public String menuByCategory(Model model, @PathVariable int id){
//        model.addAttribute("categories",categoryService.getAllCategory());
//        model.addAttribute("products",productService.getProductById(id));
//        return "menu";
//    }
}
