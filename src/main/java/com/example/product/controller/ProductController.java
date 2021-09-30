package com.example.product.controller;

import com.example.product.entity.Product;
import com.example.product.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/product")
@AllArgsConstructor
public class ProductController {

    private final IProductService productService;

    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable("id") Long productId){
        return productService.getProduct(productId);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.listAllProduct();
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }


}
