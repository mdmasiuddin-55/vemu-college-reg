package com.vemu.college.controller;

import com.vemu.college.dao.StudentDAO;
import com.vemu.college.model.Student;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
    private StudentDAO dao = new StudentDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        Student student = new Student(name, email, course);
        boolean saved = dao.saveStudent(student);

        if (saved) {
            response.sendRedirect("success.jsp");
        } else {
            response.getWriter().println("Error registering student!");
        }
    }
}
