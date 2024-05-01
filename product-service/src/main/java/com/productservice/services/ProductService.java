package com.productservice.services;

import com.productservice.model.dto.ProductRequest;
import com.productservice.model.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> findAll();
    ProductResponse save(ProductRequest productRequest);
}
