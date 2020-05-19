package com.example.all.demo.mybatis;

import com.example.all.demo.mybatis.builder.Person;
import com.example.all.demo.mybatis.mybatis.MybatisMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class AllDemoApplicationTests {

    @Test
    void contextLoads() throws IOException {
        String mybatisConfig = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(mybatisConfig);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        MybatisMapper mapper = sqlSession.getMapper(MybatisMapper.class);
        List<Person> people = mapper.selectList();
        System.out.println(people);
        List<Person> people2 = mapper.selectList();
        System.out.println(people2);
    }

}
