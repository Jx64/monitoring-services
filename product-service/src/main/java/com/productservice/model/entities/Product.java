package com.productservice.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    @Override
    public String toString(){
        return "Product{" + "id: " + id + ", name: " + name +
                ", price: " + price + "}";
    }
}
