package com.shubhada.productservice.services;

import com.shubhada.productservice.dtos.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductImpl implements ProductService{
    @Override
    public String getAllProducts() {
        return null;
    }

    @Override
    public String getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public String addNewProduct(ProductDTO productDTO) {
        return null;
    }

    @Override
    public String updateProduct(Long productId) {
        return null;
    }

    @Override
    public String deleteProduct(Long productId) {
        return null;
    }
}
