package com.vistu.spring2.product.service;

import com.vistu.spring2.product.api.request.ProductRequest;
import com.vistu.spring2.product.api.response.ProductResponse;
import com.vistu.spring2.product.domain.product;
import com.vistu.spring2.product.repository.ProductRepository;
import com.vistu.spring2.product.support.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repo, ProductMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        product p = mapper.toEntity(request);
        product saved = repo.save(p);
        return mapper.toResponse(saved);
    }

    public List<ProductResponse> getAll() {
        return repo.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public ProductResponse getById(Long id) {
        product p = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("product not found"));
        return mapper.toResponse(p);
    }

    public ProductResponse update(Long id, ProductRequest request) {
        product p = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("product not found"));

        p.setName(request.getName());

        product updated = repo.save(p);
        return mapper.toResponse(updated);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
