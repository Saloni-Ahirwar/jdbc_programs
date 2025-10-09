package org.example;

import org.example.dbconnect.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Example4 {
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
//                                                             here question mark is prarameter then query become parameterised query then who is responsible to take query for execution ans=prepared statement
            String q = "INSERT INTO person(name, location, age) VALUES (?,?,?)";


            PreparedStatement ps =con.prepareStatement(q);
            ps.setString(1,name);
        ps.setString(2,location);
      ps.setInt(3, age);

         ps.execute();
            System.out.println("record inserted");
            con.close();


        }catch (Exception e){
//            e.printStackTrace();
            System.out.println(e);
        }

    }
}