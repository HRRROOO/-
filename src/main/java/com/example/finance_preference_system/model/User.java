package com.example.financepreference.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // 使用者 ID

    private String userName; // 使用者名稱
    private String email;    // 電子郵件
    private String account;  // 帳號

    // Getter 和 Setter 方法
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getAccount() { return account; }
    public void setAccount(String account) { this.account = account; }
}
