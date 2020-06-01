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

        // New additions
        product = new Product();
        product.setAsk(new BigDecimal("10.84"));
        product.setDisplayName("Orange SA");
        product.setExchange("EPA");
        product.setHigh(new BigDecimal("11.02"));
        product.setOpen(new BigDecimal("10.74"));
        product.setVolume(7_052_056);
        product.setTicker("ORA");
        product.setProductId("P999");
        this.products.put("P999", product);

        product = new Product();
        product.setAsk(new BigDecimal("174.79"));
        product.setDisplayName("salesforce.com, inc.");
        product.setExchange("NYSE");
        product.setHigh(new BigDecimal("175.00"));
        product.setOpen(new BigDecimal("174.30"));
        product.setVolume(8_181_011);
        product.setTicker("CRM");
        product.setProductId("P225");
        this.products.put("P225", product);

        product = new Product();
        product.setAsk(new BigDecimal("1433.52"));
        product.setDisplayName("Alphabet Inc Class A");
        product.setExchange("NASDAQ");
        product.setHigh(new BigDecimal("1436.73"));
        product.setOpen(new BigDecimal("1420.43"));
        product.setVolume(1_383_501);
        product.setTicker("GOOGL");
        product.setProductId("P387");
        this.products.put("P387", product);

        product = new Product();
        product.setAsk(new BigDecimal("179.48"));
        product.setDisplayName("Zoom Video Communications Inc");
        product.setExchange("NASDAQ");
        product.setHigh(new BigDecimal("179.99"));
        product.setOpen(new BigDecimal("168.00"));
        product.setVolume(15_311_278);
        product.setTicker("ZM");
        product.setProductId("P821");
        this.products.put("P821", product);

        product = new Product();
        product.setAsk(new BigDecimal("85.27"));
        product.setDisplayName("Xero Limited");
        product.setExchange("ASX");
        product.setHigh(new BigDecimal("86.25"));
        product.setOpen(new BigDecimal("85.00"));
        product.setVolume(814_819);
        product.setTicker("XRO");
        product.setProductId("P764");
        this.products.put("P764", product);
    }

    public Collection<Product> getProducts() {
        return this.products.values();
    }

    public Product getProduct(String productId){
        return this.products.get(productId);
    }
}
