package com.example.all.demo.mybatis.mybatis;

import com.example.all.demo.mybatis.builder.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 72082934
 */
@Mapper
public interface MybatisMapper {

    /**
     * 查询所有
     *
     * @return 所有结果
     */
    List<Person> selectList();


    /**
     * @param id
     * @return
     */
    Person selectOne(Integer id);


    int update(Person person);
}
