import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO users (name, email, password, role) VALUES (?, ?, ?, 'USER')";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                response.sendRedirect("login.jsp");
            } else {
                response.getWriter().println("Registration failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
