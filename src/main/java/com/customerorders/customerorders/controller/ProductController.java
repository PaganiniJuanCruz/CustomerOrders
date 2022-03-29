package com.customerorders.customerorders.controller;

import com.customerorders.customerorders.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/all")
    List<Product> all(){
        return Arrays.asList(
                new Product(1, "Coffee Maker", "Nespresso")
        );
    }

    @PostMapping("newProduct")
    Product save (RequestBody Product product){
        return save(product);
    }
}
