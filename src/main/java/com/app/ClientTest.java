package com.app;

import com.app.bean.Product;
import com.app.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Employee;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//@SpringBootApplication
@Configuration
@SpringBootApplication
@ComponentScan({"com.app.*"})
@EnableAutoConfiguration
public class ClientTest {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(ClientTest.class, args);
        Employee emp = context.getBean(Employee.class);
        emp.Display();

        ProductService productService = context.getBean(ProductService.class);
        List<Product> productList = productService.displayProductList();
        productList.stream()
                .map(product -> {
                    double v = product.getProudctPrice() - 23000.0;
                    product.setProudctPrice(v);
                    return product;

                })
                .sorted(Comparator.comparing(Product::getId).thenComparing(Product::getProudctPrice).reversed())
                .filter(product -> product.getId() > 3).collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
