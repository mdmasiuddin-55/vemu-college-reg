package com.vemu.college.dao;
import com.vemu.college.model.Student;
import com.vemu.college.util.DBConnection;
import java.sql.*;

public class StudentDAO {
    public boolean saveStudent(Student student) {
        String sql = "INSERT INTO students(name, email, course) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCourse());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
