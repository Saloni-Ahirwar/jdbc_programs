package org.example;

import org.example.dbconnect.DBConnection;

import java.sql.Connection;
import java.sql.SQLOutput;
import java.sql.Statement;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();

        System.out.println("enter location");
        String location =sc.nextLine();

        System.out.println("enter age");
        int age=sc.nextInt();
//    -------------------------------------------------------------------    monday
        try {
//        2 create connection
            Connection con = DBConnection.takeConnection();
            Statement st=con.createStatement();
//        3 create stTEMENT

            String q = "INSERT INTO person(name, location, age) VALUES ('" + name + "', '" + location + "', " + age + ")";
            st.execute(q);
            System.out.println("record inserted");
            con.close();


        }catch (Exception e){
//            e.printStackTrace();
            System.out.println(e);
        }

    }
}