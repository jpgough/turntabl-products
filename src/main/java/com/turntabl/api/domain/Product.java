package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel( description = "Product data Model description")
public class Product {
    @ApiModelProperty(value = "unique identifier for the product")
    private String productId;
    @ApiModelProperty(value = "the exchange on which the stock is listed")
    private String exchange;
    @ApiModelProperty(value = "the executed product’s ticker symbol")
    private String ticker;
    @ApiModelProperty(value = "name of the company")
    private String displayName;
    @ApiModelProperty(value = "opening price of the product on the last trading day.")
    private BigDecimal open;
    @ApiModelProperty(value = "highest price achieved on the last trading day")
    private BigDecimal high;
    @ApiModelProperty(value = "price the product was sold or bought")
    private BigDecimal ask;
    @ApiModelProperty(value = "amount of the product traded on the last trading day")
    private Integer volume;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
