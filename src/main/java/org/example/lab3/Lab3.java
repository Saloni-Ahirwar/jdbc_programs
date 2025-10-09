package org.example.lab3;

import java.sql.*;

public class Lab3 {
    public static void main(String [] args){


        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

//        2 create connection
            String path="jdbc:mysql://localhost:3306/SchoolDb";
            String username="root";
            String password="saloni";
            Connection con = DriverManager.getConnection(path,username,password);

String sql="insert into Teacher1(id,name,subject) values(?,?,?)";
            PreparedStatement pstmt =con.prepareStatement(sql);
            pstmt.setInt(1,3);
            pstmt.setString(2,"Emma");
            pstmt.setString(3,"chemistry");
            pstmt.executeUpdate();

            String updateSQL ="UPDATE Teacher1 SET subject=? WHERE id=?";
            PreparedStatement pstmt2=con.prepareStatement(updateSQL);
            pstmt2.setString(1,"Biology");
            pstmt2.setInt(2,2);
            pstmt2.executeUpdate();

            String selectSQL="select * from Teacher1 where id=?";
            PreparedStatement pstmt3 =con.prepareStatement(selectSQL);
            pstmt3.setInt(1,1);
            ResultSet rs=pstmt3.executeQuery();





            rs.close();
            pstmt.close();
            pstmt2.close();
            pstmt3.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
