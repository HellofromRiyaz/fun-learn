package com.rj.helloWeb.controller;

import com.rj.helloWeb.model.Product;
import com.rj.helloWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService ps;



    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return ps.getProducts();

    }

    @GetMapping("/productById")
    public Product getProductByCode(@RequestParam int productId)
    {
        return ps.getProductByCode(productId);
    }



    @GetMapping("/productByName")
    public Product getProductByName(@RequestParam String productName)

    {
        return ps.getProductByName(productName);
    }




    @PostMapping("/products")
    public void addProduct (@RequestBody Product product)
    {
        ps.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct (@RequestBody Product product)
    {
        ps.updateProduct(product);
    }

    @DeleteMapping("/products")
    public void deleteProduct(@RequestBody Product product)
    {
        ps.deletePorduct(product);
    }



}
