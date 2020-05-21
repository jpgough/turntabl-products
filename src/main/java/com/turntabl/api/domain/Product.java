package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel( description = "Product data Model description")
public class Product {
    @ApiModelProperty(value = "productId description")
    private String productId;
    @ApiModelProperty(value = "exchange description")
    private String exchange;
    @ApiModelProperty(value = "ticker description")
    private String ticker;
    @ApiModelProperty(value = "displayName description")
    private String displayName;
    @ApiModelProperty(value = "open description")
    private BigDecimal open;
    @ApiModelProperty(value = "high description")
    private BigDecimal high;
    @ApiModelProperty(value = "ask description")
    private BigDecimal ask;
    @ApiModelProperty(value = "volume description")
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
