package com.yakki1.mapper;

import com.yakki1.model.Item;
import com.yakki1.model.Review;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ReviewMapper {
    @Select("SELECT * FROM reviews WHERE username = #{username} " +
            "ORDER BY date LIMIT 10 OFFSET #{offset}")
    @Results({
            @Result(property = "didPurchase",  column = "didPurchase", javaType = Boolean.class),
            @Result(property = "doRecommend", column = "doRecommend", javaType = Boolean.class)
    })
    List<Review> getReviews(String username, String text, Integer offset);

    @Select("SELECT count(distinct username) FROM reviews WHERE text LIKE CONCAT('%',#{text},'%') OR " +
            "title LIKE CONCAT('%',#{title},'%') OR username LIKE CONCAT('%',#{username},'%')")
//    @Results({
//            @Result(property = "username",  column = "reviews.username"),
//            @Result(property = "title", column = "reviews.title"),
//    })
    int getReviewCount(String username, String title, String text);

    @Insert("INSERT INTO consumer_reviews(reviews.id,username, title, date) VALUES(#{id}, #{username}, #{title}, #{date})")
    void insert(Review review);

    @Update("UPDATE consumer_reviews SET id=#{id},name=#{name} WHERE brand =#{brand}")
    void update(Review review);

    @Delete("DELETE FROM consumer_reviews WHERE id =#{id}")
    void delete(String id);
}
