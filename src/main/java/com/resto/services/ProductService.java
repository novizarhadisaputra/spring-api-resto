package com.resto.services;

import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resto.models.entities.Product;
import com.resto.models.repositories.ProductRepository;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    public Product save(Product $product) {
        $product.setId(UUID.randomUUID().toString());
        return productRepo.save($product);
    }

    public Product findOne(String $productId) {
        Optional<Product> $product = productRepo.findById($productId);
        if (!$product.isPresent()) {
            return null;
        }
        return productRepo.findById($productId).get();
    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(String $productId) {
        productRepo.deleteById($productId);
    }
}
