
package dbutil;

import java.sql.*;

public class DBUtil {

public static Connection getConnection() {
    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/productmanagementsystem", 
            "root", 
            "123@12Kumar"
        );
        System.out.println("Database connected successfully.");
    } catch (Exception e) {
        System.out.println("Database connection failed!");
        e.printStackTrace();
    }
    return conn;
}
}