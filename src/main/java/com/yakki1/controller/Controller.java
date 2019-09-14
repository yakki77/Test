package com.yakki1.controller;

import com.yakki1.mapper.ProductMapper;
import com.yakki1.mapper.ReviewMapper;
import com.yakki1.model.Product;
import com.yakki1.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ReviewMapper reviewMapper;

    @RequestMapping(value = "/getProducts", method={RequestMethod.GET})
    public List<Product> getProducts(@RequestParam String id) {
        List<Product> products = productMapper.getAll(id);
        return products;
    }

    @RequestMapping(value = "/getProduct", method={RequestMethod.GET})
    public Product getProduct(@RequestParam String id) {
        if (id == null) {
            System.out.println("id = null");
        } else {
            System.out.println(id);
        }
        Product product = productMapper.getOne(id);
        return product;
    }

    @RequestMapping(value = "/add", method={RequestMethod.POST})
    public void add(@RequestBody Product product) {
        if (product == null) {
            System.out.println("product = null");
        } else {
            System.out.println(product.toString());
        }
        productMapper.insert(product);
    }

    @RequestMapping(value="update", method={RequestMethod.POST})
    public void update(@RequestBody Product product) {
        productMapper.update(product);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        productMapper.delete(id);
    }

    @RequestMapping(value = "/getReviews", method={RequestMethod.GET})
    public List<Review> getReviews(@RequestParam String username, Integer rating, Integer count) {
        if (username == null) {
            System.out.println("username = null");
        } else {
            System.out.println(username);
        }
        List<Review> Reviews = reviewMapper.getReviews(username, rating, count);
        return Reviews;
    }

}
