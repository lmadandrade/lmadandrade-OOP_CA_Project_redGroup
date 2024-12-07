/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca_project_redgroup;

/**
 *
 * @author lucasandrade
 * Represents a user's profile containing personal and preference information.
 */

public class UserProfile {

    private int id; // Unique identifier for the user
    private String name;
    private int age;
    private double weight;
    private double height;
    private String activityLevel;
    private String goal;
    private boolean emailNotification;
    private boolean pushNotification;
    private boolean smsNotification;

    /**
     * Constructor to initialize a UserProfile instance.
     *
     * @param id                 The unique identifier for the user.
     * @param name               The user's name.
     * @param age                The user's age.
     * @param weight             The user's weight in kilograms.
     * @param height             The user's height in meters.
     * @param activityLevel      The user's activity level (e.g., "Low", "Moderate", "High").
     * @param goal               The user's fitness or health goal.
     * @param emailNotification  Whether the user prefers email notifications.
     * @param pushNotification   Whether the user prefers push notifications.
     * @param smsNotification    Whether the user prefers SMS notifications.
     */
    public UserProfile(int id, String name, int age, double weight, double height, String activityLevel, String goal, boolean emailNotification, boolean pushNotification, boolean smsNotification) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
        this.goal = goal;
        this.emailNotification = emailNotification;
        this.pushNotification = pushNotification;
        this.smsNotification = smsNotification;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public boolean isEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    public boolean isPushNotification() {
        return pushNotification;
    }

    public void setPushNotification(boolean pushNotification) {
        this.pushNotification = pushNotification;
    }

    public boolean isSmsNotification() {
        return smsNotification;
    }

    public void setSmsNotification(boolean smsNotification) {
        this.smsNotification = smsNotification;
    }

    /**
     * Checks if this UserProfile instance is equal to another.
     * Used to compare profiles for detecting changes.
     *
     * @param obj The other object to compare.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UserProfile that = (UserProfile) obj;
        return id == that.id &&
               age == that.age &&
               Double.compare(that.weight, weight) == 0 &&
               Double.compare(that.height, height) == 0 &&
               emailNotification == that.emailNotification &&
               pushNotification == that.pushNotification &&
               smsNotification == that.smsNotification &&
               name.equals(that.name) &&
               activityLevel.equals(that.activityLevel) &&
               goal.equals(that.goal);
    }

    /**
     * Generates a string representation of the UserProfile instance.
     *
     * @return A formatted string with the user's profile details.
     */
    @Override
    public String toString() {
        return String.format(
            "ID: %d\nName: %s\nAge: %d\nWeight: %.2f kg\nHeight: %.2f m\nActivity Level: %s\nGoal: %s\nEmail Notifications: %s\nPush Notifications: %s\nSMS Notifications: %s",
            id, name, age, weight, height, activityLevel, goal,
            emailNotification ? "Enabled" : "Disabled",
            pushNotification ? "Enabled" : "Disabled",
            smsNotification ? "Enabled" : "Disabled"
        );
    }
}

