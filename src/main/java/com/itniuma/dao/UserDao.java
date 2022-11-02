package com.itniuma.dao;

import com.itniuma.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select id,name,phone,address from connect")
    List<User> selectAllUser();

    @Delete("delete from connect where id = #{id}")
    int deleteById(Integer id);

    @Update("update connect set name=#{name} , phone=#{phone} , address=#{address} where id=#{id}")
    int updateUser(User user);

    @Select("select id,name,phone,address from connect where id=#{id}")
     User selectById(Integer id);

    @Insert("insert into connect(name,phone,address ) value (#{name},#{phone},#{address})")
    int addUser(User user);

    @Select("select id,name,phone,address from connect where name=#{name}")
     List<User> selectBySingleInfo(String info);

}