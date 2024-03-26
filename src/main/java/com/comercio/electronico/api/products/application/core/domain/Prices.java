package com.comercio.electronico.api.products.application.core.domain;

import java.util.Date;

/**
 * Refleja el precio final (pvp) y la tarifa que aplica a un producto de una cadena entre unas fechas determinadas
 */
public class Prices {

    private int brandId;

    private Date startDate;

    private Date endDate;

    private short priceList;

    private int productId;

    private short priority;

    private double price;

    private String curr;
    
    public Prices() {
    }

    public Prices(int brandId, Date startDate, Date endDate, short priceList, int productId, short priority, double price,
            String curr) {
        super();
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productId = productId;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }

    public int getBrandId() {
        return brandId;
    }
    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public short getPriceList() {
        return priceList;
    }
    public void setPriceList(short priceList) {
        this.priceList = priceList;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public short getPriority() {
        return priority;
    }
    public void setPriority(short priority) {
        this.priority = priority;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCurr() {
        return curr;
    }
    public void setCurr(String curr) {
        this.curr = curr;
    }
}
