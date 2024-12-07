/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca_project_redgroup;

public class UserS3 {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String activityLevel;
    private String healthGoal;

    public UserS3(String name, int age, double weight, double height, String activityLevel, String healthGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
        this.healthGoal = healthGoal;
    }

   public String getDetails() {
    return "User: " + name + ",\n" +
           "Age: " + age + ",\n" +
           "Weight: " + weight + "kg,\n" +
           "Height: " + height + "m,\n" +
           "Activity Level: " + activityLevel + ",\n" +
           "Health Goal: " + healthGoal + "\n";
    }

}
