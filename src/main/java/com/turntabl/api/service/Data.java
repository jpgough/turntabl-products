package com.turntabl.api.service;

import com.turntabl.api.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Data {
    private List<Product> products = new ArrayList<>();

    public Data() {
        Product product = new Product();
        product.setAsk(new BigDecimal("649"));
        product.setDisplayName("CARLSBERG `B`DKK20");
        product.setExchange("LSE");
        product.setHigh(new BigDecimal("848.8"));
        product.setOpen(new BigDecimal("837.7"));
        product.setVolume(11_627);
        product.setTicker("0AI4");
        product.setProductId("P556");
        this.products.add(product);

        product = new Product();
        product.setAsk(new BigDecimal("0"));
        product.setDisplayName("Sage Group Plc");
        product.setExchange("LSE");
        product.setHigh(new BigDecimal("660"));
        product.setOpen(new BigDecimal("642.6"));
        product.setVolume(6_342_504);
        product.setTicker("SGE");
        product.setProductId("P987");
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public Optional<Product> getProduct(String productId){
        return this.products
                .stream()
                .filter(product -> product.getProductId().equals(productId))
                .findFirst();
    }
}
