package com.nameicc.controller;

import com.nameicc.common.HttpResult;
import com.nameicc.service.PriceService;
import com.nameicc.service.ProductService;
import com.nameicc.service.StockService;
import com.nameicc.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @Resource
    private PriceService priceService;

    @Resource
    private StockService stockService;

    @GetMapping("query/{id}")
    public HttpResult<ProductVo> queryById(@PathVariable("id") Integer id) {
        log.info("查询商品，参数为：[{}]", id);
        HttpResult<ProductVo> result = new HttpResult<>();
        ProductVo vo = productService.queryById(id);
        priceService.fillPrice(vo);
        stockService.fillStock(vo);
        result.setData(vo);
        return result;
    }

}
