package com.yakki1.controller;

import com.yakki1.mapper.ItemMapper;
import com.yakki1.mapper.ReviewMapper;
import com.yakki1.model.Item;
import com.yakki1.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private ReviewMapper reviewMapper;

    @RequestMapping(value = "/getItemById", method={RequestMethod.GET})
    public List<Item> getItemById(@RequestParam String itemid) {
        List<Item> items = itemMapper.getItemById(itemid);
        return items;
    }

//    @RequestMapping(value = "/getItem", method={RequestMethod.GET})
//    public Item getItems(@RequestParam String id) {
//        if (id == null) {
//            System.out.println("id = null");
//        } else {
//            System.out.println(id);
//        }
//        Item item = itemMapper.getItemById(id);
//        return item;
//    }

    @RequestMapping(value = "/add", method={RequestMethod.POST})
    public void add(@RequestBody Item item) {
        if (item == null) {
            System.out.println("item = null");
        } else {
            System.out.println(item.toString());
        }
        itemMapper.insert(item);
    }

    @RequestMapping(value="update", method={RequestMethod.POST})
    public void update(@RequestBody Item item) {
        itemMapper.update(item);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        itemMapper.delete(id);
    }

    @RequestMapping(value = "/getReviews", method={RequestMethod.GET})
    @Cacheable(value="review-key")
    public List<Review> getReviews(@RequestParam String username, String text, Integer page) {
        if (username == null) {
            System.out.println("username = null");
        } else {
            System.out.println(username);
        }
        int offset = 10*(page-1);
        List<Review> Reviews = reviewMapper.getReviews(username, text, offset);
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return Reviews;
    }

    @RequestMapping(value = "/getReviewCount", method={RequestMethod.GET})
    public int getReviewCount(@RequestParam String query) {
        if (query == null) {
            System.out.println("query = null");
        } else {
            System.out.println(query);
        }
        int count = reviewMapper.getReviewCount(query, query, query);
        return count;
    }

}
