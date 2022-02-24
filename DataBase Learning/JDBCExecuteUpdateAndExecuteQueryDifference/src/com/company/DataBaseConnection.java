package com.company;


import java.sql.*;

public class DataBaseConnection {
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
            int num = statement.executeUpdate(sql);
            System.out.println(num+" Of rows get affected");

            /*ResultSet set = statement.executeQuery(sql);

            System.out.println("ResultSet of insert Query" + set.toString());*/
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void CreatePrepared(Connection connection, String name) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into sqlInjection (fullName) values (?);");
        statement.setString(1,name);
        int num = statement.executeUpdate();
        System.out.println(num+" of rows get affected");
/*
        ResultSet set = statement.executeQuery();
        System.out.println("ResultSet of insert Query" + set.toString());*/
        statement.close();
        connection.close();
    }

    public static ResultSet Read(Connection connection){
        try {
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("SELECT * from sqlInjection");
/*
            int num = statement.executeUpdate("SELECT * from sqlInjection");
            System.out.println(num+" of rows get affected");*/
            return set;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
