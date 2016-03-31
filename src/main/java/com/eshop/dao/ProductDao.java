package com.eshop.dao;

import com.eshop.model.Product;

import java.util.List;

/**
 * Created by cicctusers on 2/26/2016.
 */
public interface ProductDao {

    void addProduct(Product product);

    void editProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProducts();

    void deleteProduct(String id);
}
