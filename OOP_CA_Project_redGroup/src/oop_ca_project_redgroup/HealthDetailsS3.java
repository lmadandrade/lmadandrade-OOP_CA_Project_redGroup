 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package oop_ca_project_redgroup;

    public class HealthDetailsS3 {
    private int steps;
    private int caloriesIn;
    private int caloriesOut;
    private String exerciseType;
    private int duration; // in minutes
    private int sleepHours;
    private String overallHealth;

    public HealthDetailsS3(int steps, int caloriesIn, int caloriesOut, String exerciseType, 
                           int duration, int sleepHours, String overallHealth) {
        this.steps = steps;
        this.caloriesIn = caloriesIn;
        this.caloriesOut = caloriesOut;
        this.exerciseType = exerciseType;
        this.duration = duration;
        this.sleepHours = sleepHours;
        this.overallHealth = overallHealth;
    }

    public int getSteps() {
        return steps;
    }

    public int getCaloriesIn() {
        return caloriesIn;
    }

    public int getCaloriesOut() {
        return caloriesOut;
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public String getExerciseType() {
        return exerciseType;
    }

   public String getDetails() {
    return "Steps: " + steps + "\n" +
           "Calories In: " + caloriesIn + "\n" +
           "Calories Out: " + caloriesOut + "\n" +
           "Exercise Type: " + exerciseType + "\n" +
           "Duration: " + duration + " mins\n" +
           "Sleep Hours: " + sleepHours + "\n" +
           "Overall Health: " + overallHealth + "\n";
}

}
