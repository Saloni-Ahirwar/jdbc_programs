package org.example;

import org.example.dbconnect.DBConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class Example7 {
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
            CallableStatement ps=con.prepareCall("{call getAdditionalage(?)}");
ps.setInt(1,25);
ps.registerOutParameter(1, Types.INTEGER);
ps.execute();

int age=ps.getInt(1);
System.out.println("uo="+age);


            con.close();


        }catch (Exception e){
//            e.printStackTrace();
            System.out.println(e);
        }

    }
}