package com.itniuma.dao;

import com.itniuma.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select id,user_name,phone_number,address from mail_line")
    List<User> selectAllUser();

    @Delete("delete from mail_line where id = #{id}")
    int deleteById(Integer id);

    @Update("update mail_line set user_name=#{user_name} , phone_number=#{phone_number} , address=#{address} where id=#{id}")
    int updateUser(User user);

    @Select("select id,user_name,phone_number,address from mail_line where id=#{id}")
     User selectById(Integer id);

    @Insert("insert into mail_line(user_name,phone_number,address ) value (#{user_name},#{phone_number},#{address})")
    int addUser(User user);

    @Select("select id,user_name,phone_number,address from mail_line where user_name=#{user_name}")
     List<User> selectBySingleInfo(String info);

}