package com.yakki1.mapper;

import com.yakki1.model.Item;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ItemMapper {
    @Select("SELECT * FROM items WHERE itemid = #{itemid}")
//    @Results({
//            @Result(property = "name",  column = "name", javaType = ReviewEnum.class),
//            @Result(property = "brand", column = "brand")
//    })
    List<Item> getItemById(String itemid);

    @Select("SELECT * FROM items WHERE brand = #{brand} ")
//    @Results({
//            @Result(property = "userSex",  column = "user_sex", javaType = ReviewEnum.class),
//            @Result(property = "nickName", column = "nick_name")
//    })
    Item getItemByBrand(String brand);

    @Insert("INSERT INTO consumer_reviews(id,name,brand) VALUES(#{id}, #{name}, #{brand})")
    void insert(Item product);

    @Update("UPDATE consumer_reviews SET id=#{id},name=#{name} WHERE brand =#{brand}")
    void update(Item product);

    @Delete("DELETE FROM consumer_reviews WHERE id =#{id}")
    void delete(String id);
}
