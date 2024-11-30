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
        // connection to the database
        healthDBConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBhealthApp", "root", "password");
        System.out.println("Connection successful.");
    } catch (SQLException ex) {
        // Print an error message if the connection fails
        System.out.println("SQL Exception on Connect: " + ex.getLocalizedMessage());
    }
}


    /**
     * This adds a new health record to the database.
     */
  public void addHealthData(HealthRecord record) {
    String sql = "INSERT INTO health_data (steps, water, calories, activity_type, duration, sleep_hours, sleep_quality, timestamp) "
                 + "VALUES (" 
                 + record.getSteps() + ", " 
                 + record.getWaterIntake() + ", "
                 + record.getCalories() + ", '" 
                 + record.getActivityType().strip() + "', "
                 + record.getDuration() + ", "
                 + record.getSleepHours() + ", '"
                 + record.getSleepQuality().strip() + "', CURRENT_TIMESTAMP)";
    try {
        Statement myStatement = healthDBConnection.createStatement();
        myStatement.executeUpdate(sql);
    } catch (SQLException e) {
        System.out.println("SQL Exception on insert: " + e.getLocalizedMessage());
    }
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
}

