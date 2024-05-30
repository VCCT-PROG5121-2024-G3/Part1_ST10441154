/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe1;

/**
 *
 * @author LeoAddinall_ST10441154_ST10441154@vcconnect.edu.za
 */
public class TaskInfo {

    private String taskName; // Stores the task name
    private int taskNumber; // Stores the task number
    private String taskDescription; // Stores the task description
    private String developerDetails; // Stores the task name
    private double taskDuration; // Stores the task duration
    private String taskID; // Stores the task ID
    private String taskStatus; // Stores the task status

    //Default constructor for UserInfo class.
    public TaskInfo() {

    }

    //Parameterized constructor for UserInfo class.
    public TaskInfo(String taskName, int taskNumber, String taskDescription, String developerDetails, double taskDuration, String taskID, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskID = createTaskID();
        this.taskStatus = taskStatus;
    }

    // Getters and setters for taskName
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    // Getters and setters for taskNumber
    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    // Getters and setters for taskDescription
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    // Getters and setters for developerDetails
    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    // Getters and setters for taskDuration
    public double getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(double taskDuration) {
        this.taskDuration = taskDuration;
    }

    // Getters and setters for taskID
    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    // Getters and setters for taskStatus
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    //----------------------------------------------------------------------------------------------------
    
    private String createTaskID() {
        String firstTwoChars = taskName.substring(0, Math.min(taskName.length(), 2)).toUpperCase();
        String lastThreeChars = developerDetails.substring(Math.max(developerDetails.length() - 3, 0)).toUpperCase();
        return String.format("%s%d:%s", firstTwoChars, taskNumber, lastThreeChars);
    }
}

    //----------------------------END OF FILE----------------------------------------------//  
