package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbutil.DBUtil;
import pojo.LoginInfo;

public class LoginDAO {

    public static boolean isUserValid(LoginInfo userDetails) {
        boolean validStatus = false;
        String sql = "SELECT * FROM login_info WHERE userName = ? AND password = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "kumar");
            ps.setString(2, "123");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                validStatus = true; // User found
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return validStatus;
    }
}