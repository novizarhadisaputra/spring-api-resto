package com.resto.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.resto.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
