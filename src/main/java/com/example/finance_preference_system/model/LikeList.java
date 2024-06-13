package com.example.financepreference.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class LikeList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sn; // 序號

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user; // 使用者

    @ManyToOne
    @JoinColumn(name = "no", nullable = false)
    private Product product; // 產品

    private String orderName; // 訂單名稱
    private String account;   // 帳號
    private BigDecimal totalFee; // 總手續費
    private Integer totalAmount; // 總數量

    // Getter 和 Setter 方法
    public Long getSn() { return sn; }
    public void setSn(Long sn) { this.sn = sn; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public String getOrderName() { return orderName; }
    public void setOrderName(String orderName) { this.orderName = orderName; }
    public String getAccount() { return account; }
    public void setAccount(String account) { this.account = account; }
    public BigDecimal getTotalFee() { return totalFee; }
    public void setTotalFee(BigDecimal totalFee) { this.totalFee = totalFee; }
    public Integer getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Integer totalAmount) { this.totalAmount = totalAmount; }
}
