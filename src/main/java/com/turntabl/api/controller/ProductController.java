package com.turntabl.api.controller;

import com.turntabl.api.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setAsk(new BigDecimal("649"));
        product.setDisplayName("CARLSBERG `B`DKK20");
        product.setExchange("LSE");
        product.setHigh(new BigDecimal("848.8"));
        product.setOpen(new BigDecimal("837.7"));
        product.setVolume(11_627);
        product.setTicker("0AI4");
        product.setProductId("P556");
        products.add(product);

        product = new Product();
        product.setAsk(new BigDecimal("0"));
        product.setDisplayName("Sage Group Plc");
        product.setExchange("LSE");
        product.setHigh(new BigDecimal("660"));
        product.setOpen(new BigDecimal("642.6"));
        product.setVolume(6_342_504);
        product.setTicker("SGE");
        product.setProductId("P987");
        products.add(product);

        return products;
    }
}
