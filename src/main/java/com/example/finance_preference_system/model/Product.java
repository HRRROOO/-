package com.example.financepreference.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no; // 產品編號

    private String productName; // 產品名稱
    private BigDecimal price;   // 產品價格
    private BigDecimal feeRate; // 手續費率

    // Getter 和 Setter 方法
    public Long getNo() { return no; }
    public void setNo(Long no) { this.no = no; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public BigDecimal getFeeRate() { return feeRate; }
    public void setFeeRate(BigDecimal feeRate) { this.feeRate = feeRate; }
}
