package org.example.test;

import org.example.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJdbc_ioc {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //插入数据
    @Test
    public void test1(){
        int i = jdbcTemplate.update("insert into user values(?,?,?)", 3, "王五", "3344");
        System.out.println(i);
    }

    //修改数据
    @Test
    public void test2(){
        int i = jdbcTemplate.update("update user set password=? where username=?", "qwq", "张三");
        System.out.println(i);
    }

    //删除数据
    @Test
    public void test3(){
        int i = jdbcTemplate.update("delete from user where username=?", "王五");
        System.out.println(i);
    }

/*-------------------------------------查询-----------------------------------------*/
    //聚合查询
    @Test
    public void test4(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from user ", long.class);
        System.out.println(aLong);
    }

    //单条查询
    @Test
    public void test5(){
        User user = jdbcTemplate.queryForObject("select * from user where username=?", new BeanPropertyRowMapper<User>(User.class), "李四");
        System.out.println(user);
    }

    //查询所有
    @Test
    public void test6(){
        List<User> userList = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<>(User.class));
        System.out.println(userList);
    }
}
