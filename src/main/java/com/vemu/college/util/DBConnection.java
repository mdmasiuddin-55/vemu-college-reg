package com.vemu.college.util;
import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://<AWS-RDS-ENDPOINT>:3306/collegeDB";
    private static final String USER = "admin";
    private static final String PASS = "yourpassword";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
