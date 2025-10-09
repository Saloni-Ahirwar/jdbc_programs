package org.example.lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab2 {
public static void main (String [] args){
    try{
//        1 Register driver
        Class.forName("com.mysql.cj.jdbc.Driver");

//        2 create connection
        String path="jdbc:mysql://localhost:3306/SchoolDb";
        String username="root";
        String password="saloni";
        Connection con = DriverManager.getConnection(path,username,password);

        Statement stmt=con.createStatement();
        stmt.executeUpdate("create table Teacher1(id int primary key, name varchar(50), subject varchar(50))");
//        stmt.executeUpdate("insert into Teacher1(id ,name ,subject) values(1,'john','math')");
//        stmt.executeUpdate("insert into Teacher1(id ,name ,subject) values(2,'john2','physics')");


        ResultSet rs =stmt.executeQuery("select * from Teacher2");
        while(rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("subject"));
        }

        rs.close();
        stmt.close();
        con.close();


    } catch (Exception e) {
        System.out.println(e);
    }
}
}
