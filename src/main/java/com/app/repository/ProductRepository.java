package com.app.repository;

import com.app.bean.Product;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {
public List<Product> displayProductList()  {
    List<Product> productList = null;
    try {
        productList = Arrays.asList
                (new Product(1,"Samsung",10000.0,
                        new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2020")),
                        new Product(2,"LG",25000.0,
                                new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2021")),
                        new Product(3,"Apple",30000.0,
                                new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2020")),
                        new Product(4,"LG",25000.0,
                                new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2024")),
                        new Product(6,"Apple",34000.0,
                                new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2022")),
                        new Product(7,"Pegion",45000.0,
                                new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2021")),
                        new Product(8,"Arjun",12000.0,
                                new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2023"))
                        );
    } catch (ParseException e) {
        throw new RuntimeException(e);
    }
    return productList;
}

}
