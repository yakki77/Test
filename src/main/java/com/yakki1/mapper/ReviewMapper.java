package com.yakki1.mapper;

import com.yakki1.model.Product;
import com.yakki1.model.Review;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface ReviewMapper {
    @Select("SELECT * FROM consumer_reviews WHERE reviews.username = #{username} LIMIT 1")
    @Results({
            @Result(property = "auto_id", column = "auto_id"),
            @Result(property = "productid", column = "id"),
            @Result(property = "date",  column = "reviews.date"),
            @Result(property = "dateSeen", column = "reviews.dateSeen"),
            @Result(property = "didPurchase",  column = "reviews.didPurchase"),
            @Result(property = "doRecommend", column = "reviews.doRecommend"),
            @Result(property = "id",  column = "reviews.id"),
            @Result(property = "numHelpful", column = "reviews.numHelpful"),
            @Result(property = "rating",  column = "reviews.rating"),
            @Result(property = "sourceURLs", column = "reviews.sourceURLs"),
            @Result(property = "text", column = "reviews.text"),
            @Result(property = "username",  column = "reviews.username"),
            @Result(property = "title", column = "reviews.title")
    })
    List<Review> getReviews(String username, Integer rating, Integer count);

    @Select("SELECT * FROM consumer_reviews WHERE reviews.username = #{username} LIMIT 1")
//    @Results({
//            @Result(property = "username",  column = "reviews.username"),
//            @Result(property = "title", column = "reviews.title"),
//    })
    Product getByUser(String username);

    @Insert("INSERT INTO consumer_reviews(reviews.id,username, title, date) VALUES(#{id}, #{username}, #{title}, #{date})")
    void insert(Review review);

    @Update("UPDATE consumer_reviews SET id=#{id},name=#{name} WHERE brand =#{brand}")
    void update(Review review);

    @Delete("DELETE FROM consumer_reviews WHERE id =#{id}")
    void delete(String id);
}
