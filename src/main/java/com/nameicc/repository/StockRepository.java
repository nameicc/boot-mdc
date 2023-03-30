package com.nameicc.repository;

import com.nameicc.vo.ProductVo;

public interface StockRepository {

    void fillStock(ProductVo product);

}
