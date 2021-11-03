package com.sapiens.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");String id = scanner.next();
        System.out.println("Enter NAME: ");String name = scanner.next();
        System.out.println("Enter AGE: ");String age = scanner.next();
        System.out.println("Enter DEPT: ");String dept = scanner.next();
        System.out.println("Enter DESIG: ");String desig = scanner.next();
        System.out.println("Enter QUALIFICATION: ");String qualification = scanner.next();
        System.out.println("Enter EMAIL_ID: ");String emailID = scanner.next();
        System.out.println("Enter CONTACT: ");String contact = scanner.next();
        System.out.println("Enter SALARY: ");String salary = scanner.next();
        System.out.println("Enter TOTAL_YEARS_EXP: ");String totalYearsOfExp = scanner.next();


        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Establish the driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "root");
        System.out.println("Connection Establish Succesfully");

        String sql = "INSERT INTO EmployeeDetails VALUES("+id+",'"+name+"', "+age+", '"+dept+"', '"+desig+"', '"+qualification+"', '"+emailID+"', "+contact+" , "+salary+", "+totalYearsOfExp+")";
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate(sql);
        if (result==1) {
            System.out.println("Transaction IS Successful");
        }else{
            System.out.println("Transaction Failed");
        }
        System.out.println("Table Updated Successfully");
        connection.close();
    }
}
