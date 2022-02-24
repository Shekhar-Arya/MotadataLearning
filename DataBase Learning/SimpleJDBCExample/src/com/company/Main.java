package com.company;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
	// write your code here
        int choice = 0;
        while (choice!=5)
        {
            System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=");
            System.out.println(" Press 1 for Create: \n Press 2 for Read: \n Press 3 for Update: \n Press 4 for Delete: \n Press 5 for Exit :");
            choice = s.nextInt();
            s.nextLine();
            switch (choice){
                case 1:
                    // Create
                    Create();
                    break;
                case 2:
                    // Read
                    Read();
                    break;
                case 3:
                    Update();
                    // Update
                    break;
                case 4:
                    Delete();
                    // Delete
                    break;
                case 5:
                    System.out.println("Bye take care!!");
                    break;
                default:
                    System.out.println("Enter Valid Choice!!!");
                    break;
            }
        }
    }

    public static void Create() throws SQLException {
        BeanClass bean = new BeanClass();
        System.out.println("Please Enter Following Details");
        System.out.println("Enter Your Full name");
        bean.setFullName(s.nextLine());
        System.out.println("Enter your Username");
        bean.setUserName(s.nextLine());
        System.out.println("Enter your Password");
        bean.setPassword(s.nextLine());
        DatabaseConnection.Create(DatabaseConnection.getConnection(),bean);
    }

    public static void Read() throws SQLException {
        List<BeanClass> beanClassList = DatabaseConnection.Read(DatabaseConnection.getConnection());
        if(beanClassList.isEmpty()){
            System.out.println("NO DATA TO SHOW");
        }
        else {
            for (BeanClass bean:beanClassList) {
                System.out.println(bean.toString());
            }
        }
    }

    public static void Update() throws SQLException {
        BeanClass bean = new BeanClass();
        System.out.println("Please Enter Following Details");
        System.out.println("Enter ID");
        bean.setId(s.nextInt());
        s.nextLine();
        System.out.println("Enter Your Full name");
        bean.setFullName(s.nextLine());
        System.out.println("Enter your Username");
        bean.setUserName(s.nextLine());
        System.out.println("Enter your Password");
        bean.setPassword(s.nextLine());
        DatabaseConnection.Update(DatabaseConnection.getConnection(),bean);
    }

    public static void Delete() throws SQLException {
        System.out.println("Enter Id to delete");
        int id = s.nextInt();
        DatabaseConnection.Delete(DatabaseConnection.getConnection(),id);
    }
}
