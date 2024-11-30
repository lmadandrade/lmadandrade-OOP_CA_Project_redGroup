/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca_project_redgroup;

/**
 *
 * @author lucasandrade
 */


public class HealthRecord {
    private int steps;
    private double waterIntake;
    private double calories;
    private String activityType;
    private double duration;
    private double sleepHours;
    private String sleepQuality;
    private String timestamp;

    public HealthRecord(int steps, double waterIntake, double calories, String activityType, double duration, double sleepHours, String sleepQuality, String timestamp) {
        this.steps = steps;
        this.waterIntake = waterIntake;
        this.calories = calories;
        this.activityType = activityType;
        this.duration = duration;
        this.sleepHours = sleepHours;
        this.sleepQuality = sleepQuality;
        this.timestamp = timestamp;
    }

    public int getSteps() {
        return steps;
    }

    public double getWaterIntake() {
        return waterIntake;
    }

    public double getCalories() {
        return calories;
    }

    public String getActivityType() {
        return activityType;
    }

    public double getDuration() {
        return duration;
    }

    public double getSleepHours() {
        return sleepHours;
    }

    public String getSleepQuality() {
        return sleepQuality;
    }

    @Override
    public String toString() {
        return String.format("Date: %s\nSteps: %d\nWater Intake: %.2f L\nCalories: %.2f\nActivity: %s\nDuration: %.2f hours\nSleep Hours: %.2f\nSleep Quality: %s",
                timestamp, steps, waterIntake, calories, activityType, duration, sleepHours, sleepQuality);
    }
}
