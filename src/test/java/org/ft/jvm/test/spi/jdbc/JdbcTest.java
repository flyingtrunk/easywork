package org.ft.jvm.test.spi.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class JdbcTest {

    @Test
    public void test01() throws Exception {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();
    }

    @Test
    public void test02() throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://xxxx", "xxx", "xxx");


    }

}
