package com.example.starload.Mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.example.starload.DTO.UserImpoForm;

public interface LoginMapper {
    @Insert("insert into books (title, author, image) values (#{title}, #{author}, #{image})")
    public boolean create(UserImpoForm book);
    @Select("select * from books")
    public List<UserImpoForm> getList();
}