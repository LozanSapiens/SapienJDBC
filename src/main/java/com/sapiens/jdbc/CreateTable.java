package com.sapiens.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
        System.out.println("Connection Establish Succesfully");

        String sql = "CREATE TABLE EmployeeDetails(ID INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(20), AGE INT, DEPT VARCHAR(45), DESIG VARCHAR(45), QUALIFICATION VARCHAR(45), EMAIL_ID VARCHAR(45), CONTACT INT, SALARY INT, TOTAL_YEARS_OF_EXP INT, PRIMARY KEY (ID))";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        System.out.println("Table created successfully");
        connection.close();
    }
}
