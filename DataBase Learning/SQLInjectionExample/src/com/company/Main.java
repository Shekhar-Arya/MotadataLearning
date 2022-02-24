package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

    while (true){
        Create();
        Read();
    }


    }

    public static void Create(){
        System.out.println("Please Enter Full Name");

        // Input Should be following to make sql Injection
        // ss'); Truncate table sqlInjection#
        String name = s.nextLine();
        // This is added by Normal Statement
        System.out.println(name+" : This is added by Normal Statement");
        DatabaseConnection.Create(DatabaseConnection.getConnection(),name);
        try {
            // This is added by Prepared Statement
            System.out.println(name+" : This is added by Prepared Statement");
            DatabaseConnection.CreatePrepared(DatabaseConnection.getConnection(),name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Read(){
        ResultSet set = DatabaseConnection.Read(DatabaseConnection.getConnection());
        try {
        while (set.next()) {
              System.out.println(set.getInt("id")+" : "+set.getString("fullName"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
