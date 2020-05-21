package com.turntabl.api.controller;

import com.turntabl.api.domain.Product;
import com.turntabl.api.service.ProductDemoData;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductDemoData data;

    @GetMapping("/products")
    @ApiOperation(
            value = "Returns all products ",
            notes = "Multiple products object values, separated by comma"
    )
    public Collection<Product> getProducts() {
        return data.getProducts();
    }

    @GetMapping(value = "/products/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(
            value = "Returns a product by an Id",
            notes = "single products object value with matching id"
    )
    public ResponseEntity<Product> getProduct(@PathVariable(value = "productId") String productId){
        Product product = data.getProduct(productId);
        return ResponseEntity.ok(product);
    }
}
