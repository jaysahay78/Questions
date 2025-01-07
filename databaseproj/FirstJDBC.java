package com.company.databaseproj;

import java.sql.*;

public class FirstJDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/jaydb";
            String user = "root";
            String password = "Jayiscool1";

            Connection con = DriverManager.getConnection(url, user, password);

            //create a query
            String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";

            //create a statement
            Statement st = con.createStatement();
            st.executeUpdate(q);


            System.out.println("table created in database");
            con.close();

            if (con.isClosed()) {
                System.out.println("Connection is closed");
            }
            else {
                System.out.println("Connection created...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
