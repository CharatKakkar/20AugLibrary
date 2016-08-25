package com.ebookstore.service.impl;

import com.ebookstore.dao.ProductDao;
import com.ebookstore.model.Product;
import com.ebookstore.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public Product getProductById (int productId) {
        return productDao.getProductById(productId);
    }

    public List<Product> getProductList () {
        return productDao.getProductList();
    }

}
