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
     */
    public UserProfile(int id, String name, int age, double weight, double height, String activityLevel, String goal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
        this.goal = goal;
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
            "ID: %d\nName: %s\nAge: %d\nWeight: %.2f kg\nHeight: %.2f m\nActivity Level: %s\nGoal: %s",
            id, name, age, weight, height, activityLevel, goal
        );
    }
    
            /**
         * Calculates the BMI (Body Mass Index) based on the user's weight and height.
         *
         * @return The calculated BMI, or -1 if height or weight is invalid.
         */
        public double calculateBMI() {
             if (height > 0) {
                return weight / ((height / 100) * (height / 100)); // Convert height to meters
                }
                return -1; // Return -1 for invalid height
            }


        /**
         * Classifies the BMI value into categories such as "Underweight" or "Obesity".
         *
         * @return The BMI classification as a String.
         */
        public String getBMIClassification() {
                    double bmi = calculateBMI();
                    if (bmi == -1) {
                        return "Invalid";
                    } else if (bmi < 18.5) {
                        return "Underweight";
                    } else if (bmi >= 18.5 && bmi < 25) {
                        return "Normal weight";
                    } else if (bmi >= 25 && bmi < 30) {
                        return "Overweight";
                    } else {
                        return "Obese";
                    }
   }

}

