package com.nameicc.repository.impl;

import com.nameicc.repository.ProductRepository;
import com.nameicc.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public ProductVo queryById(Integer id) {
        log.info("product-repository查询商品");
        ProductVo vo = new ProductVo();
        vo.setProductId(id);
        vo.setSku("sku-" + id);
        vo.setProductName("长江" + id + "号");
        return vo;
    }

}
