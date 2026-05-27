package com.vistu.spring2.product.support;

import org.springframework.stereotype.Component;
import com.vistu.spring2.product.api.request.ProductRequest;
import com.vistu.spring2.product.api.response.ProductResponse;
import com.vistu.spring2.product.domain.product;

@Component
public class ProductMapper {

    public product toEntity(ProductRequest request) {
        return new product(request.getName());
    }

    public ProductResponse toResponse(product p) {
        return new ProductResponse(p.getId(), p.getName());
    }
}
