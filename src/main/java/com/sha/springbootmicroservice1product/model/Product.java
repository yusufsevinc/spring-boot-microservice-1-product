package com.sha.springbootmicroservice1product.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name" , length = 100 , nullable = false)
    private String productName;

    @Column(name = "product_price" , nullable = false)
    private Double productPrice;

    @Column(name = "product_create_time" , nullable = false)
    private LocalDateTime productCreateTime;

}
