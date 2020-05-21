package com.turntabl.api.service;

import com.turntabl.api.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ProductDemoData {
    private Map<String, Product> products = new HashMap<>();

    public ProductDemoData() {
        Product product = new Product();
        product.setAsk(new BigDecimal("649"));
        product.setDisplayName("CARLSBERG `B`DKK20");
        product.setExchange("LSE");
        product.setHigh(new BigDecimal("848.8"));
        product.setOpen(new BigDecimal("837.7"));
        product.setVolume(11_627);
        product.setTicker("0AI4");
        product.setProductId("P556");
        this.products.put("P556", product);

        product = new Product();
        product.setAsk(new BigDecimal("0"));
        product.setDisplayName("Sage Group Plc");
        product.setExchange("LSE");
        product.setHigh(new BigDecimal("660"));
        product.setOpen(new BigDecimal("642.6"));
        product.setVolume(6_342_504);
        product.setTicker("SGE");
        product.setProductId("P987");
        this.products.put("P987", product);
    }

    public Collection<Product> getProducts() {
        return this.products.values();
    }

    public Product getProduct(String productId){
        return this.products.get(productId);
    }
}
