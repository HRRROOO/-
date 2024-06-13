package com.example.financepreference.service;

import com.example.financepreference.model.Product;
import com.example.financepreference.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // 獲取所有產品
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 根據 ID 獲取特定產品
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + id));
    }

    // 新增產品
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // 刪除產品
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    // 更新產品
    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + id));
        product.setProductName(productDetails.getProductName());
        product.setPrice(productDetails.getPrice());
        product.setFeeRate(productDetails.getFeeRate());
        return productRepository.save(product);
    }
}
