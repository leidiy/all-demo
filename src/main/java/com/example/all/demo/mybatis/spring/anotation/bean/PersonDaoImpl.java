package com.example.all.demo.mybatis.spring.anotation.bean;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 72082934
 */
@Repository(value = "personDao")
public class PersonDaoImpl extends SqlSessionDaoSupport implements PersonDao {
    @Override
    public List<Person> selectPersons() {
        return getSqlSession().getMapper(PersonDao.class).selectPersons();
    }
}
