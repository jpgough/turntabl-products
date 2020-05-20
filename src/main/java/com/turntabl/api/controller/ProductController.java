package com.turntabl.api.controller;

import com.turntabl.api.domain.Product;
import com.turntabl.api.service.Data;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private Data data;

    @GetMapping("/products")
    @ApiOperation(
            value = "Returns all products ",
            notes = "Multiple products object values, separated by comma"
    )
    public List<Product> getProducts() {
        return data.getProducts();
    }

    @GetMapping(value = "/products/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(
            value = "Returns a product by an Id",
            notes = "single products object value with matching id"
    )
    public ResponseEntity<Product> getProduct(@PathVariable(value = "productId") String productId){
        Optional<Product> product = data.getProduct(productId);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
