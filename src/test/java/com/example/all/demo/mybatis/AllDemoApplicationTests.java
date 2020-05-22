package com.example.all.demo.mybatis;

import com.example.all.demo.mybatis.builder.Person;
import com.example.all.demo.mybatis.mybatis.MybatisMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
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

        final SqlSession session = sessionFactory.openSession(ExecutorType.BATCH);
    }


    /**
     * mybatis两种方式实现 批量操作
     * 1）。SqlSession session = sessionFactory.openSession(ExecutorType.BATCH);
     * 2) 整合spring，注入sqlsession 指定 executor type batch
     *
     */
}
