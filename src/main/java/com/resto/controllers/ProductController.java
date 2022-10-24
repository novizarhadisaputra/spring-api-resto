package com.resto.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resto.models.entities.Product;
import com.resto.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService $productService;

    @GetMapping
    public Iterable<Product> index() {
        return $productService.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product $product) {
        return $productService.save($product);
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable("id") String id) {
        return $productService.findOne(id);
    }

    @PutMapping
    public Product update(@RequestBody Product $product) {
        return $productService.save($product);
    }

    @DeleteMapping("/{id}")
    public void destroy(@PathVariable("id") String id) {
        $productService.removeOne(id);
    }
}
