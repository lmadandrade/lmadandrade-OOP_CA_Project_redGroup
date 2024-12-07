package oop_ca_project_redgroup;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User_LoginDummy {
    private String email;
    private String password;

    // Static list to hold all dummy users
    private static ArrayList<User_LoginDummy> dummyUsers = new ArrayList<>();

    // Constructor
    public User_LoginDummy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Static block to initialize with default users
    static {
        dummyUsers.add(new User_LoginDummy("admin@example.com", "admin123")); // Default user
    }
    
    

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Validate login
    public static boolean validateLogin(String email, String password) {
        for (User_LoginDummy user : dummyUsers) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Add a new user
    public static boolean addUser(String email, String password) {
        // Check if email already exists
        for (User_LoginDummy user : dummyUsers) {
            if (user.getEmail().equals(email)) {
                return false; // Email already registered
            }
        }
        dummyUsers.add(new User_LoginDummy(email, password));
        return true; // Successfully added
    }
    
    public static int getUserId(String email) {
    String sql = "SELECT id FROM users WHERE email = ?";
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBhealthApp", "root", "password");
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, email);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return rs.getInt("id"); // Return the user ID
        }
    } catch (SQLException e) {
        System.err.println("Error fetching user ID: " + e.getMessage());
    }
    return -1; // Return -1 if user is not found
}
}