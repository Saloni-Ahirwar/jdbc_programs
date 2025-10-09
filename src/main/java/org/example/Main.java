package org.example;
import org.example.dbconnect.DBConnection;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
//       try{
////           1 Register driver class
//           Class.forName("com.mysql.cj.jdbc.Driver");
//
////           create connection
//           String path="jdbc:mysql://localhost:3306/dbclass";
//           String  username="root";
//           String password="saloni";
//           Connection con = DriverManager.getConnection(path,username,password);
//
//           if(con!=null)
//               System.out.println("connection established");
//           else
//               System.out.print("connection is not stablished");
//
////            3.create  statement object
//           String query ="insert into personps(id,name) values (10,'murli')";
//            Statement st=con.createStatement();
//
////            4 query execution
//
//           st.execute(query);
//           System.out.println("data stored");
//           con.close();
//       }
//
//       catch(Exception e){
//           System.out.println(e);
//
//       }

//    --------------------------------------------------------------------    monday
        try {
//        2 create connection
            Connection con = DBConnection.takeConnection();
            Statement st=con.createStatement();
//        3 create stTEMENT

            String q="insert into person(name,location ,age) values('james' ,'bhopal',25)";
            st.execute(q);
            con.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}