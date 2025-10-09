package org.example;

import org.example.dbconnect.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

//    -------------------------------------------------------------------    monday
        try {

            Connection con = DBConnection.takeConnection();
            Statement st=con.createStatement();


            String q="select * from person";
            ResultSet rs=st.executeQuery(q);

            while(rs.next()){
             System.out.print(rs.getString(1)+"\t");
                System.out.print(rs.getString("name")+"\t");
                System.out.print(rs.getString("location")+"\t");
                System.out.print(rs.getString("age")+"\t");
                System.out.println();

            }
//            System.out.println("record inserted");
            con.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}