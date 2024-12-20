package com.rj.helloWeb.service;

import com.rj.helloWeb.model.Product;
import com.rj.helloWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

/*
    List<Product> dbProductList = new ArrayList<Product>(Arrays.asList(
            new Product(1, "Dell", 800),
            new Product(2, "Mac", 1500),
            new Product(3, "HP", 600)
    ));
*/

    public List<Product> getProducts()
    {

       return repo.findAll();

    }


    public Product getProductByCode(int Id) {
        System.out.println("inside getProductByCode");

       // return dbProductList.stream().filter(p -> p.getProductCode()==Id).findFirst().orElse(new Product(0 ,"Dummy product",0));

        return repo.findById(Id).orElse(new Product());
    }

   public void addProduct (Product product)
   {
       System.out.println("inside addProduct");
      //  dbProductList.add(product);
         repo.save(product);
   }

    public void updateProduct(Product product) {
        System.out.println("inside upDate");


        System.out.println("inside updateProduct product" + product);
/*
        for(int i=0; i <dbProductList.size();i++) {

                if (dbProductList.get(i).getProductCode() == product.getProductCode())
                    dbProductList.set(i, product);
        }*/
        repo.save(product);
    }

    public void deletePorduct(Product product) {

        System.out.println("inside DELETE product" + product);

    /*   for(int i=0; i <dbProductList.size();i++) {

            if (dbProductList.get(i).getProductCode() == product.getProductCode())
                dbProductList.remove(i);
        }*/
        repo.delete(product);

    }

    public Product getProductByName(String productName) {

        return repo.findByProductName(productName);
    }
}
