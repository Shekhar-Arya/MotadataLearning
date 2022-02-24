package com.company;

import com.sun.javaws.security.Resource;

import java.sql.*;

public class DatabaseConnection {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Here in below url of sql ?allowMultipleQueries=true will allow multiple queries.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestData?allowMultiQueries=true","root","Shekh@r2705");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void Create(Connection connection, String name){
        try {
            Statement statement = connection.createStatement();
            String sql = "insert into sqlInjection (fullName) values ('"+name+"');";
                statement.executeUpdate(sql);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void CreatePrepared(Connection connection, String name) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into sqlInjection (fullName) values (?);");
        statement.setString(1,name);
        statement.executeUpdate();
        statement.close();
        connection.close();
    }

    public static ResultSet Read(Connection connection){
        try {
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("SELECT * from sqlInjection");
            return set;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
