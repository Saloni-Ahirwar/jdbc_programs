package org.example;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
       try{
//           1 Register driver class
           Class.forName("com.mysql.cj.jdbc.Driver");

//           create connection
           String path="jdbc:mysql://localhost:3306/dbclass";
           String  username="root";
           String password="saloni";
           Connection con = DriverManager.getConnection(path,username,password);

           if(con!=null)
               System.out.println("connection established");
           else
               System.out.print("connection is not stablished");

       }

       catch(Exception e){
           System.out.println(e);

       }
    }
}