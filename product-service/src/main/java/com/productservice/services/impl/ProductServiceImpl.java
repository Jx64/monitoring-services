package com.productservice.services.impl;

import com.productservice.model.dto.ProductRequest;
import com.productservice.model.dto.ProductResponse;
import com.productservice.model.entities.Product;
import com.productservice.model.mapper.ProductMapper;
import com.productservice.repositories.ProductRepository;
import com.productservice.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductResponse> findAll() {
        List<Product> productList = productRepository.findAll();
        return productList.stream().map(productMapper::productToDto).toList();
    }

    @Override
    public ProductResponse save(ProductRequest productRequest) {
        Product product = productMapper.dtoToProduct(productRequest);
        return productMapper.productToDto(productRepository.save(product));
    }
}
