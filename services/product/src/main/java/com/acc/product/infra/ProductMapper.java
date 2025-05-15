package com.acc.product.infra;

import org.springframework.stereotype.Service;

import com.acc.product.models.Category;
import com.acc.product.models.Product;
import com.acc.product.utils.ProductRequest;
import com.acc.product.utils.ProductResponse;

@Service
public class ProductMapper {
  public Product toProduct(ProductRequest request) {
    return Product.builder()
        .id(request.id())
        .name(request.name())
        .description(request.description())
        .availableQuantity(request.availableQuantity())
        .price(request.price())
        .category(
            Category.builder()
                .id(request.categoryId())
                .build())
        .build();
  }

  public ProductResponse toProductResponse(Product product) {
    return new ProductResponse(
        product.getId(),
        product.getName(),
        product.getDescription(),
        product.getAvailableQuantity(),
        product.getPrice(),
        product.getCategory().getId(),
        product.getCategory().getName(),
        product.getCategory().getDescription());
  }

}