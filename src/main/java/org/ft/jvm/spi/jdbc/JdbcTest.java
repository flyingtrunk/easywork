package org.ft.jvm.spi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

    public static void main(String[] args) throws Exception {
        //1. 加载驱动类
        Class.forName("com.mysql.jdbc.Driver");
        // 2. 获取数据库连接
        Connection connection = DriverManager.getConnection("url", "username", "pswd");
        // 3. 操作数据库。实现增删改查
        Statement statement = connection.createStatement();
        // 4. 执行sql
        ResultSet resultSet = statement.executeQuery("sql");
        // 5. 解析结果

    }

}
