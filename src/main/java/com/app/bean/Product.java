package com.app.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;


@Data
@AllArgsConstructor
public class Product {

    private int Id;
    private String productName;
    private double proudctPrice;
    private Date expDate;

}
