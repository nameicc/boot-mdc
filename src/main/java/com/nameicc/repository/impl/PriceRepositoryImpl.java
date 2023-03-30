package com.nameicc.repository.impl;

import com.nameicc.repository.PriceRepository;
import com.nameicc.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Slf4j
@Repository
public class PriceRepositoryImpl implements PriceRepository {

    @Override
    public void fillPrice(ProductVo product) {
        log.info("price-repository填充价格");
        product.setPrice(new BigDecimal(Math.random() * 1000).setScale(2, BigDecimal.ROUND_HALF_UP));
    }

}
