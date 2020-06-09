package com.example.all.demo.mybatis.mybatis;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 用于处理paramter 设值，以及resultHandler封装返回值
 * 1)封装查询返回值可以在resultMap中的每个字段result中使用typeHandler
 * 2) 插入更新的时候都可以使用自定义的typeHandler
 * @author 72082934
 */
public class MyTypeHandler implements TypeHandler<Object> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, o.toString());
    }

    @Override
    public Object getResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public Object getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
