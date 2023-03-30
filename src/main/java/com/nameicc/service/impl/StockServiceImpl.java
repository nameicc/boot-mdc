package com.nameicc.service.impl;

import com.nameicc.repository.StockRepository;
import com.nameicc.service.StockService;
import com.nameicc.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class StockServiceImpl implements StockService {

    @Resource
    private StockRepository stockRepository;

    @Override
    public void fillStock(ProductVo product) {
        log.info("stock-service填充库存");
        stockRepository.fillStock(product);
    }

}
