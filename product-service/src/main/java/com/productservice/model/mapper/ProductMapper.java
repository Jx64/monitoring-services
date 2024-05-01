package com.productservice.model.mapper;

import com.productservice.model.dto.ProductRequest;
import com.productservice.model.dto.ProductResponse;
import com.productservice.model.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductResponse productToDto(Product product);
    Product dtoToProduct(ProductRequest productRequest);
}
