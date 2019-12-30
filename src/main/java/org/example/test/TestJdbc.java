package org.example.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class TestJdbc {
    @Test
    public void test1() throws PropertyVetoException {
        //创建数据库连接池
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db3");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        //创建jdbc模板对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置模板
        jdbcTemplate.setDataSource(dataSource);

        //执行操作
        int i = jdbcTemplate.update("insert into user values(?,?,?)", 2, "李四", "2333");
        System.out.println(i);

    }
}
