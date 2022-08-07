package com.app.service;

import com.app.bean.Product;
import com.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> displayProductList(){
        List<Product> productList = productRepository.displayProductList();
        return productList;
    }
}
