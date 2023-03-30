package com.nameicc.service.impl;

import com.nameicc.repository.PriceRepository;
import com.nameicc.service.PriceService;
import com.nameicc.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class PriceServiceImpl implements PriceService {

    @Resource
    private PriceRepository priceRepository;

    @Override
    public void fillPrice(ProductVo product) {
        log.info("price-service填充价格");
        priceRepository.fillPrice(product);
    }

}
