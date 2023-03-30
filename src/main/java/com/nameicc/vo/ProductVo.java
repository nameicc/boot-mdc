package com.nameicc.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductVo implements Serializable {

    private Integer productId;

    private String sku;

    private String productName;

    private BigDecimal price;

    private Integer stock;

}
