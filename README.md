# Finance Preference System

## 專案描述

Finance Preference System 是一個用於記錄和管理用戶喜好金融商品的系統。用戶可以新增、查詢、刪除和更改喜好金融商品的信息。

## 功能

  - 新增喜好金融商品
  - 查詢喜好金融商品清單
  - 刪除喜好金融商品資訊
  - 更改喜好金融商品資訊

## 技術

  - **前端**：Vue.js
  - **後端**：Spring Boot
  - **資料庫**：MySQL
  - **依賴管理**：Maven
  - **API**：RESTful API

API 端點
  - GET /api/products - 獲取所有產品
  - GET /api/products/{id} - 根據 ID 獲取特定產品
  - POST /api/products - 新增產品
  - PUT /api/products/{id} - 更新產品
  - DELETE /api/products/{id} - 刪除產品
