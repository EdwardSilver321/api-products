package com.comercio.electronico.api.products.adapters.in.controller.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PricesResponse {

    private int brandId;

    private Date startDate;

    private Date endDate;

    private short priceList;

    private int productId;

    private double price;
}
