package com.sapiens.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DropTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The table you want to drop ");String tableName = scanner.next();


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
        System.out.println("Connection Establish Succesfully");

        Statement statement = connection.createStatement();
        String sql= "DROP TABLE "+tableName+";";
        statement.executeUpdate(sql);
        System.out.println("Table dropped successfully....");
        connection.close();
    }
}
