package com.rj.helloWeb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Data
@Component
@Entity
public class Product {

  @Id
  private int productCode;
  private String productName;
  private int productPrice;

  public Product(int productCode, String productName, int productPrice) {
    this.productCode = productCode;
    this.productName = productName;
    this.productPrice = productPrice;
  }

  public Product() {
    System.out.println("Product constructor invoked");
  }

  public int getProductCode() {
    return productCode;
  }

  public void setProductCode(int productCode) {
    this.productCode = productCode;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(int productPrice) {
    this.productPrice = productPrice;
  }

  @Override
  public String toString() {
    return "Product{" +
            "productCode=" + productCode +
            ", productName='" + productName + '\'' +
            ", productPrice=" + productPrice +
            '}';
  }
}

