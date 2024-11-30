/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_ca_project_redgroup;

/**
 *
 * @author lucasguimaraes
 */
class HealthDetailsS3 {
    private int steps;
    private int waterIntake;
    private int calories;
    private String activityType;
    private int duration;
    private int sleepHours;
    private String sleepQuality;

    public HealthDetailsS3(int steps, int waterIntake, int calories, String activityType, int duration, int sleepHours, String sleepQuality) {
        this.steps = steps;
        this.waterIntake = waterIntake;
        this.calories = calories;
        this.activityType = activityType;
        this.duration = duration;
        this.sleepHours = sleepHours;
        this.sleepQuality = sleepQuality;
    }

    public String getHealthDetails() {
        return "Steps: " + steps + "\nWater Intake: " + waterIntake + "ml\nCalories Intake: " + calories +
               "\nActivity Type: " + activityType + "\nDuration: " + duration + " mins\nSleep Hours: " +
               sleepHours + "\nSleep Quality: " + sleepQuality + "\n";
    }
}
