package org.example.lab1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lab1 {
    public static void main(String[] args) {
        try{
//           1 Register driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

//           2.create connection
            String path="jdbc:mysql://localhost:3306/SchoolDB";
            String  username="root";
            String password="saloni";
            Connection con = DriverManager.getConnection(path,username,password);

            if(con!=null)
                System.out.println("connection established");
            else
                System.out.print("connection is not stablished");

//            3.create  statement object
            String query ="insert into Students(id,name,age) values (1,'saloni',20)";
            Statement st=con.createStatement();

//            4 query execution

            st.execute(query);
            System.out.println("data stored");
            con.close();
        }

        catch(Exception e){
            System.out.println(e);

        }
    }
}
