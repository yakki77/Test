package com.yakki1.mapper;

import com.yakki1.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductMapper {
    @Select("SELECT * FROM consumer_reviews WHERE id = #{id}")
//    @Results({
//            @Result(property = "name",  column = "name", javaType = UserSexEnum.class),
//            @Result(property = "brand", column = "brand")
//    })
    List<Product> getAll(String id);

    @Select("SELECT * FROM consumer_reviews WHERE id = #{id} LIMIT 1")
//    @Results({
//            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
//            @Result(property = "nickName", column = "nick_name")
//    })
    Product getOne(String id);

    @Insert("INSERT INTO consumer_reviews(id,name,brand) VALUES(#{id}, #{name}, #{brand})")
    void insert(Product product);

    @Update("UPDATE consumer_reviews SET id=#{id},name=#{name} WHERE brand =#{brand}")
    void update(Product product);

    @Delete("DELETE FROM consumer_reviews WHERE id =#{id}")
    void delete(String id);
}
