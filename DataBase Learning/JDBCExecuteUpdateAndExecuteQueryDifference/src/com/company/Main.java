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
        DataBaseConnection.Create(DataBaseConnection.getConnection(),name);
        try {
            // This is added by Prepared Statement
            System.out.println(name+" : This is added by Prepared Statement");
            DataBaseConnection.CreatePrepared(DataBaseConnection.getConnection(),name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Read(){
        ResultSet set = DataBaseConnection.Read(DataBaseConnection.getConnection());
        try {
            while (set.next()) {
                System.out.println(set.getInt("id"));
                System.out.println(set.getString("fullName"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
