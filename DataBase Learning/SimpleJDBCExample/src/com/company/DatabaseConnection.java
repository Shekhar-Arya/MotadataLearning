package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
    public static void main(String[] args) {

    }
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/TestData","root","Shekh@r2705");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean isPresent(Connection connection, int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from testTable where id = ?");
        statement.setInt(1,id);
        ResultSet set = statement.executeQuery();
        return set.next();
    }

    public static void Create(Connection con, BeanClass bean) throws SQLException {
        PreparedStatement stmt=con.prepareStatement("insert into testTable (fullName,username,password) values (?,?,?)");
        stmt.setString(1,bean.getFullName());
        stmt.setString(2,bean.getUserName());
        stmt.setString(3,bean.getPassword());
        int result = stmt.executeUpdate();
        stmt.close();
        con.close();
    }

    public static List<BeanClass> Read(Connection connection) throws SQLException {
        PreparedStatement stmt=connection.prepareStatement("select * from testTable");
        ResultSet resultSet = stmt.executeQuery();
        List<BeanClass> beanClassList = new ArrayList<>();
        while (resultSet.next())
        {
            BeanClass bean = new BeanClass();
            bean.setId(resultSet.getInt("id"));
            bean.setFullName(resultSet.getString("fullName"));
            bean.setUserName(resultSet.getString("username"));
            bean.setPassword(resultSet.getString("password"));
            beanClassList.add(bean);
        }
        stmt.close();
        connection.close();
        return beanClassList;
    }

    public static void Update(Connection con, BeanClass bean) throws SQLException {
        if(isPresent(con,bean.getId())){
            PreparedStatement statement = con.prepareStatement("update testTable set fullName=?, username=?, password=? where id=?");
            statement.setString(1,bean.getFullName());
            statement.setString(2,bean.getUserName());
            statement.setString(3,bean.getPassword());
            statement.setInt(4,bean.getId());
            statement.executeUpdate();
            statement.close();
            con.close();
        }
        else {
            System.out.println("No Data Found");
        }
    }

    public static void Delete(Connection connection, int id) throws SQLException {
        if(isPresent(connection,id)){
            PreparedStatement statement = connection.prepareStatement("delete from testTable where id = ?");
            statement.setInt(1,id);
            statement.executeUpdate();
            statement.close();
            connection.close();
        }
        else {
            System.out.println("No Data Found");
        }
    }
}
