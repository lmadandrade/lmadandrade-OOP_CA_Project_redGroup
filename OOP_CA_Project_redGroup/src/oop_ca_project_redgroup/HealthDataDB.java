/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca_project_redgroup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import org.mindrot.jbcrypt.BCrypt;


/**
 *
 * @author lucasandrade
 */
public class HealthDataDB {
    
    
    private Connection healthDBConnection;

    /**
     * This opens a connection to the DB.
     * 
     */
 public void getConnection() {
    try {
        if (healthDBConnection == null || healthDBConnection.isClosed()) {
            healthDBConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/DBhealthApp", "root", "password");
            System.out.println("Connection successful.");
        }
    } catch (SQLException ex) {
        System.err.println("SQL Exception on Connect: " + ex.getLocalizedMessage());
    }
}


    /**
     * This adds a new health record to the database.
     */
  public void addHealthData(HealthRecord record, int userId) {
    String sql = "INSERT INTO health_data (user_id, steps, water, calories, activity_type, duration, sleep_hours, sleep_quality, timestamp) "
                 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
    try (PreparedStatement pstmt = healthDBConnection.prepareStatement(sql)) {
        pstmt.setInt(1, userId); // Set the user ID
        pstmt.setInt(2, record.getSteps()); // Set steps
        pstmt.setDouble(3, record.getWaterIntake()); // Set water intake
        pstmt.setDouble(4, record.getCalories()); // Set calories burned
        pstmt.setString(5, record.getActivityType()); // Set activity type
        pstmt.setDouble(6, record.getDuration()); // Set duration
        pstmt.setDouble(7, record.getSleepHours()); // Set sleep hours
        pstmt.setString(8, record.getSleepQuality()); // Set sleep quality

        pstmt.executeUpdate(); // Execute the query
        System.out.println("Health data added successfully.");
    } catch (SQLException e) {
        System.err.println("Error adding health data: " + e.getMessage());
    }
}
// Retrieve health data for a specific user
public ArrayList<HealthRecord> getHealthDataByUser(int userId) {
    ArrayList<HealthRecord> healthRecords = new ArrayList<>();
    String sql = "SELECT * FROM health_data WHERE user_id = ?";
    try (PreparedStatement pstmt = healthDBConnection.prepareStatement(sql)) {
        pstmt.setInt(1, userId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            HealthRecord record = new HealthRecord(
                rs.getInt("steps"),
                rs.getDouble("water"),
                rs.getDouble("calories"),
                rs.getString("activity_type"),
                rs.getDouble("duration"),
                rs.getDouble("sleep_hours"),
                rs.getString("sleep_quality"),
                rs.getString("timestamp")
            );
            healthRecords.add(record);
        }
    } catch (SQLException e) {
        System.err.println("Error retrieving health data: " + e.getMessage());
    }
    return healthRecords;
}
  public boolean registerUser(String email, String password) {
    String sql = "INSERT INTO users (email, password_hash) VALUES (?, ?)";
    try (PreparedStatement pstmt = healthDBConnection.prepareStatement(sql)) {
        // Use a secure password hashing library like BCrypt or PBKDF2
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        pstmt.setString(1, email);
        pstmt.setString(2, hashedPassword);
        pstmt.executeUpdate();
        return true;
    } catch (SQLException e) {
        System.err.println("Error registering user: " + e.getMessage());
        return false;
    }
}

// Method to validate login credentials
public boolean validateLogin(String email, String password) {
    String sql = "SELECT password_hash FROM users WHERE email = ?";
    try (PreparedStatement pstmt = healthDBConnection.prepareStatement(sql)) {
        pstmt.setString(1, email);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String storedHash = rs.getString("password_hash");
            // Use BCrypt to verify the password
            return BCrypt.checkpw(password, storedHash);
        }
    } catch (SQLException e) {
        System.err.println("Error validating login: " + e.getMessage());
    }
    return false;
}

    /**
     * get all health records from the database as a list of HealthRecord
     * @return ArrayList of HealthRecord objects
     */
    public ArrayList<HealthRecord> getAllHealthData() {
        ArrayList<HealthRecord> healthRecords = new ArrayList<>();
        String sql = "SELECT * FROM health_data";
        try (Statement stmt = healthDBConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                HealthRecord record = new HealthRecord(
                    rs.getInt("steps"),
                    rs.getDouble("water"),
                    rs.getDouble("calories"),
                    rs.getString("activity_type"),
                    rs.getDouble("duration"),
                    rs.getDouble("sleep_hours"),
                    rs.getString("sleep_quality"),
                    rs.getString("timestamp")
                );
                healthRecords.add(record);
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data: " + e.getMessage());
        }
        return healthRecords;
    }

    /**
     * Retrieves all health data as a string for displaying on the GUI
     * @return Formatted string of all health records.
     */
    public String getAllHealthDataAsString() {
        StringBuilder sb = new StringBuilder("Health Data Summary:\n\n");
        ArrayList<HealthRecord> records = getAllHealthData();
        for (HealthRecord record : records) {
            sb.append(record).append("\n");
        }
        return sb.toString();
    }

    /**
     * Closes the database connection.
     */
    public void closeConnection() {
        try {
            if (healthDBConnection != null && !healthDBConnection.isClosed()) {
                healthDBConnection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
    
    public double getAverageSteps() {
    String sql = "SELECT AVG(steps) AS avgSteps FROM health_data";
    try (Statement stmt = healthDBConnection.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        if (rs.next()) {
            return rs.getDouble("avgSteps");
        }
    } catch (SQLException e) {
        System.err.println("Error calculating average steps: " + e.getMessage());
    }
    return 0; // Default value if no data 
}

    // Method to calculate avg water intake
    public double getAverageWaterIntake() {
        String sql = "SELECT AVG(water) AS avgWater FROM health_data";
        try (Statement stmt = healthDBConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getDouble("avgWater");
            }
        } catch (SQLException e) {
            System.err.println("Error calculating average water intake: " + e.getMessage());
        }
        return 0;
    }

    // Method to calculate avg calories
    public double getAverageCalories() {
        String sql = "SELECT AVG(calories) AS avgCalories FROM health_data";
        try (Statement stmt = healthDBConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getDouble("avgCalories");
            }
        } catch (SQLException e) {
            System.err.println("Error calculating average calories: " + e.getMessage());
        }
        return 0;
    }

    // Method to find the most frequent activity type
    public String getMostFrequentActivityType() {
        String sql = "SELECT activity_type, COUNT(activity_type) AS count FROM health_data GROUP BY activity_type ORDER BY count DESC LIMIT 1";
        try (Statement stmt = healthDBConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getString("activity_type");
            }
        } catch (SQLException e) {
            System.err.println("Error finding most frequent activity type: " + e.getMessage());
        }
        return "N/A";
    }

    // Method to calculate avg duration
    public double getAverageDuration() {
        String sql = "SELECT AVG(duration) AS avgDuration FROM health_data";
        try (Statement stmt = healthDBConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getDouble("avgDuration");
            }
        } catch (SQLException e) {
            System.err.println("Error calculating average duration: " + e.getMessage());
        }
        return 0;
    }

    // Method to calculate avg sleep hours
    public double getAverageSleepHours() {
        String sql = "SELECT AVG(sleep_hours) AS avgSleepHours FROM health_data";
        try (Statement stmt = healthDBConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getDouble("avgSleepHours");
            }
        } catch (SQLException e) {
            System.err.println("Error calculating average sleep hours: " + e.getMessage());
        }
        return 0;
    }

    // Method to find the most frequent sleep quality
    public String getMostFrequentSleepQuality() {
        String sql = "SELECT sleep_quality, COUNT(sleep_quality) AS count FROM health_data GROUP BY sleep_quality ORDER BY count DESC LIMIT 1";
        try (Statement stmt = healthDBConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getString("sleep_quality");
            }
        } catch (SQLException e) {
            System.err.println("Error finding most frequent sleep quality: " + e.getMessage());
        }
        return "N/A";
    }
    
    public ArrayList<HealthRecord> getHealthDataByTimeframe(String timeframe) {
        ArrayList<HealthRecord> healthRecords = new ArrayList<>();
        String sql = "";

        // SQL query based on the timeframe
        switch (timeframe) {
            case "Today":
                sql = "SELECT * FROM health_data WHERE DATE(timestamp) = CURDATE()";
                break;
            case "Past 7 Days":
                sql = "SELECT * FROM health_data WHERE DATE(timestamp) >= CURDATE() - INTERVAL 7 DAY";
                break;
            case "Past 30 Days":
                sql = "SELECT * FROM health_data WHERE DATE(timestamp) >= CURDATE() - INTERVAL 30 DAY";
                break;
            case "All Time":
            default:
                sql = "SELECT * FROM health_data";
                break;
        }

        // Execute the query and populate health records
        try (Statement stmt = healthDBConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                HealthRecord record = new HealthRecord(
                    rs.getInt("steps"),
                    rs.getDouble("water"),
                    rs.getDouble("calories"),
                    rs.getString("activity_type"),
                    rs.getDouble("duration"),
                    rs.getDouble("sleep_hours"),
                    rs.getString("sleep_quality"),
                    rs.getString("timestamp")
                );
                healthRecords.add(record);
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data: " + e.getMessage());
        }

        return healthRecords;
    }
    // Method to get user profile
    public UserProfile getUserProfile() {
        UserProfile profile = null;
    String sql = "SELECT * FROM user_profile WHERE id = 1"; // Assuming a single user with ID 1
    try (Statement stmt = healthDBConnection.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        if (rs.next()) {
            profile = new UserProfile(
                rs.getInt("id"), // Fetch the ID
                rs.getString("name"),
                rs.getInt("age"),
                rs.getDouble("weight"),
                rs.getDouble("height"),
                rs.getString("activity_level"),
                rs.getString("goal"),
                rs.getBoolean("email_notification"),
                rs.getBoolean("push_notification"),
                rs.getBoolean("sms_notification")
            );
        }
    } catch (SQLException e) {
        System.err.println("Error retrieving user profile: " + e.getMessage());
    }
    return profile;
    }

    // Method to save or update user profile
    public void saveOrUpdateUserProfile(UserProfile profile) {
            String sql = "INSERT INTO user_profile (id, name, age, weight, height, activity_level, goal, email_notification, push_notification, sms_notification) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) " +
                 "ON DUPLICATE KEY UPDATE " +
                 "name = VALUES(name), age = VALUES(age), weight = VALUES(weight), height = VALUES(height), " +
                 "activity_level = VALUES(activity_level), goal = VALUES(goal), email_notification = VALUES(email_notification), " +
                 "push_notification = VALUES(push_notification), sms_notification = VALUES(sms_notification)";
    try (PreparedStatement pstmt = healthDBConnection.prepareStatement(sql)) {
        pstmt.setInt(1, profile.getId()); // Use the ID as the primary key
        pstmt.setString(2, profile.getName());
        pstmt.setInt(3, profile.getAge());
        pstmt.setDouble(4, profile.getWeight());
        pstmt.setDouble(5, profile.getHeight());
        pstmt.setString(6, profile.getActivityLevel());
        pstmt.setString(7, profile.getGoal());
        pstmt.setBoolean(8, profile.isEmailNotification());
        pstmt.setBoolean(9, profile.isPushNotification());
        pstmt.setBoolean(10, profile.isSmsNotification());

        int rowsAffected = pstmt.executeUpdate();
        System.out.println("Rows affected: " + rowsAffected); // Verify the update
    } catch (SQLException e) {
        System.err.println("Error saving/updating user profile: " + e.getMessage());
    }

    }
}


