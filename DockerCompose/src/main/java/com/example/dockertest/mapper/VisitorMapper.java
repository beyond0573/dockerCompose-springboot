package com.example.dockertest.mapper;

import com.example.dockertest.entity.Visitor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "visitorMapper")
public interface VisitorMapper {

    @Select("SELECT * FROM visitor WHERE ip =#{ip}")
    Visitor getOne(String ip);

    @Update("UPDATE visitor SET ip=#{ip} ,times=#{times} WHERE ip =#{ip}")
    void update(Visitor visitor);

    @Insert("INSERT INTO visitor(ip,times) VALUES(#{ip},#{times})")
    void insert(Visitor visitor);
}
