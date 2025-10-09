package org.example.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection takeConnection(){
        Connection con=null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

//           create connection
            String path="jdbc:mysql://localhost:3306/db";
            String  user="root";
            String password="saloni";
             con = DriverManager.getConnection(path,user,password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return  con;
    }
}
