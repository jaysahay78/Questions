package com.company.databaseproj;
import java.sql.*;
import java.io.*;

public class insertJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jaydb";
            String user = "root";
            String password = "Jayiscool1";

            Connection con = DriverManager.getConnection(url, user, password);

            String q = "insert into table1(tName, tCity) values(?,?)";

            PreparedStatement ps = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name: ");
            String name = br.readLine();

            System.out.println("Enter city: ");
            String city = br.readLine();

            ps.setString(1, name);
            ps.setString(2, city);

            ps.executeUpdate();

            System.out.println("inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
