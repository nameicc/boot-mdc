package com.nameicc.repository.impl;

import com.nameicc.repository.StockRepository;
import com.nameicc.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class StockRepositoryImpl implements StockRepository {

    @Override
    public void fillStock(ProductVo product) {
        log.info("stock-repository填充库存");
        product.setStock(111);
    }

}
