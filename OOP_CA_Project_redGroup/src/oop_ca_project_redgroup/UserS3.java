/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca_project_redgroup;

/**
 *
 * @author lucasguimaraes
 */
class UserS3 {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String activityLevel;
    private String goals;

    public UserS3(String name, int age, double weight, double height, String activityLevel, String goals) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.activityLevel = activityLevel;
        this.goals = goals;
    }

    public String getUserDetails() {
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "kg\nHeight: " + height +
               "m\nActivity Level: " + activityLevel + "\nGoals: " + goals + "\n";
    }

    
}
