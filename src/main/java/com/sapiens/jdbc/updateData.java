package com.sapiens.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updateData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The name of the column that you want to update: ");String columnName = scanner.next();
        System.out.println("Enter The  new value: ");String columnvalue = scanner.next();
        System.out.println("Enter The ID of the employee that you want to update: ");String IdValue = scanner.next();


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
        System.out.println("Connection Establish Succesfully");

        Statement statement = connection.createStatement();
        String sql= "UPDATE EmployeeDetails SET "+columnName+" = "+columnvalue+" WHERE ID= "+IdValue+";";
        statement.executeUpdate(sql);
        System.out.println("Updated done successfully....");
        connection.close();
    }
}
