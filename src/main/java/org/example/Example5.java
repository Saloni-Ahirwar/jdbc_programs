package org.example;

import org.example.dbconnect.DBConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Types;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter name");
//        String name=sc.nextLine();
//
//        System.out.println("enter location");
//        String location =sc.nextLine();
//
//        System.out.println("enter age");
//        int age=sc.nextInt();
//    -------------------------------------------------------------------    monday
        try {
//        2 create connection
            Connection con = DBConnection.takeConnection();

//            CallableStatement ps=con.prepareCall("{insertPerson(?,?,?)}");


//            thursday
            CallableStatement ps=con.prepareCall("{call GetRecord(?,?)}");
ps.setInt(1,25);
ps.registerOutParameter(2, Types.VARCHAR);
ps.execute();

String name=ps.getString(2);
System.out.println(name);


//            ps.setString(1,name);
//        ps.setString(2,location);
//      ps.setInt(3, age);

//         ps.execute();
//            System.out.println("record inserted");
            con.close();


        }catch (Exception e){
//            e.printStackTrace();
            System.out.println(e);
        }

    }
}