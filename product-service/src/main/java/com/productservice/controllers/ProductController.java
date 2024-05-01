package com.productservice.controllers;

import com.productservice.model.dto.ProductRequest;
import com.productservice.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok().body(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody ProductRequest productRequest){
        return ResponseEntity.ok().body(productService.save(productRequest));
    }
}
