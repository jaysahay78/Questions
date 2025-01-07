package com.company.databaseproj;
import java.io.*;
import java.sql.*;

public class imageSave {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaydb","root", "Jayiscool1");
            String q = "insert into images(pic) values(?)";

            PreparedStatement pstmt = con.prepareStatement(q);
            FileInputStream fis = new FileInputStream("C:/Users/LEGION/Downloads/jaySahay.jpeg");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done..");
        }
        catch (Exception e){
            System.out.println("error!");
        }
    }
}
