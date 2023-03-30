package com.nameicc.repository;

import com.nameicc.vo.ProductVo;

public interface ProductRepository {

    ProductVo queryById(Integer id);

}
