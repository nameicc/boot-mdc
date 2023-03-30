package com.nameicc.service.impl;

import com.nameicc.repository.ProductRepository;
import com.nameicc.service.ProductService;
import com.nameicc.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductRepository productRepository;

    @Override
    public ProductVo queryById(Integer id) {
        log.info("product-service查询商品");
        return productRepository.queryById(id);
    }

}
