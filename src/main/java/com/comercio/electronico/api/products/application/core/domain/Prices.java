package com.comercio.electronico.api.products.application.core.domain;

import java.util.Date;

/**
 * Clase que representa el precio final (PVP) y la tarifa que se aplica a un producto de una cadena entre unas fechas determinadas.
 */
public class Prices {

    /** Identificador de la cadena. */
    private int brandId;

    /** Fecha de inicio de la tarifa. */
    private Date startDate;

    /** Fecha de fin de la tarifa. */
    private Date endDate;

    /** Tarifa aplicada. */
    private short priceList;

    /** Identificador del producto. */
    private int productId;

    /** Prioridad de la tarifa. */
    private short priority;

    /** Precio del producto. */
    private double price;

    /** Moneda en la que se expresa el precio. */
    private String curr;

    /** Constructor vacío de la clase Prices. */
    public Prices() {
    }

    /**
     * Constructor de la clase Prices con parámetros.
     * @param brandId    Identificador de la cadena.
     * @param startDate  Fecha de inicio de vigencia de la tarifa.
     * @param endDate    Fecha de fin de vigencia dela tarifa.
     * @param priceList  Tarifas.
     * @param productId  Identificador del producto.
     * @param priority   Prioridad de la tarifa.
     * @param price      Precio del producto.
     * @param curr       Moneda en la que se expresa el precio.
     */
    public Prices(int brandId, Date startDate, Date endDate, short priceList, int productId, short priority, double price,
            String curr) {
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productId = productId;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }

    // Getters y Setters

    /** Obtiene el identificador de la cadena. */
    public int getBrandId() {
        return brandId;
    }

    /** Establece el identificador de la cadena. */
    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    /** Obtiene la fecha de inicio de la tarifa. */
    public Date getStartDate() {
        return startDate;
    }

    /** Establece la fecha de inicio de la tarifa. */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /** Obtiene la fecha de fin de la tarifa. */
    public Date getEndDate() {
        return endDate;
    }

    /** Establece la fecha de fin de la tarifa. */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /** Obtiene la lista de precios. */
    public short getPriceList() {
        return priceList;
    }

    /** Establece la lista de precios. */
    public void setPriceList(short priceList) {
        this.priceList = priceList;
    }

    /** Obtiene el identificador del producto. */
    public int getProductId() {
        return productId;
    }

    /** Establece el identificador del producto. */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /** Obtiene la prioridad de la tarifa. */
    public short getPriority() {
        return priority;
    }

    /** Establece la prioridad de la tarifa. */
    public void setPriority(short priority) {
        this.priority = priority;
    }

    /** Obtiene el precio del producto. */
    public double getPrice() {
        return price;
    }

    /** Establece el precio del producto. */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Obtiene la moneda en la que se expresa el precio. */
    public String getCurr() {
        return curr;
    }

    /** Establece la moneda en la que se expresa el precio. */
    public void setCurr(String curr) {
        this.curr = curr;
    }
}