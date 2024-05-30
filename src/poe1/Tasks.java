/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe1;

import Poe1.UserInfo;
import Poe1.UserInput;
import javax.swing.JOptionPane;

public class Tasks {

    // Class variables to keep track of total hours and task information.
    static double totalHours = 0;
    public static TaskInfo taskInfo = new TaskInfo();
    private static int currentTaskNumber = 0;

    // Method to display options and handle user choices
    public static void Option() {
        boolean menu = false;

        while (!menu) {
            String[] options = {"Add tasks", "Show report", "Quit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Task Manager", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    // Add tasks logic
                    int numTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks you want to add:"));
                    taskInfo.setTaskNumber(numTasks);
                    task();
                    break;
                case 1:
                    // Show report logic
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    break;
                case 2:
                    // Quit the program
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice");
            }
        }
    }

    // Validates if the task description is within the allowed length.
    public static boolean checkTaskDcription(String taskDescript) {
        return taskDescript != null && taskDescript.length() <= 50;
    }

    // Handles the task creation process, including gathering task details from the user and storing them.
    public static void task() {
        // Retrieve user information stored in UserInput class
        UserInfo storedUserInfo = UserInput.userInfo;

        // Loop to add multiple tasks based on user input
        for (int i = 0; i < taskInfo.getTaskNumber(); i++) {
            currentTaskNumber++;

            // Input for task name
            String taskName = JOptionPane.showInputDialog("Enter name of task");
            taskInfo.setTaskName(taskName);

            // Input and validation for task description
            boolean validDec = false;
            while (!validDec) {
                String taskDescript = JOptionPane.showInputDialog("Enter task description");
                if (checkTaskDcription(taskDescript)) {
                    JOptionPane.showMessageDialog(null, "Task successfully captured");
                    taskInfo.setTaskDescription(taskDescript);
                    validDec = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                }
            }

            // Setting developer details using stored user information
            String devDetails = storedUserInfo.getFirstName() + " " + storedUserInfo.getLastName();
            taskInfo.setDeveloperDetails(devDetails);

            // Input for task duration
            double duration = Double.parseDouble(JOptionPane.showInputDialog("What is the estimated duration of the task in hours"));
            taskInfo.setTaskDuration(duration);

            // Accumulate total hours
            totalHours += duration;

            // Generate and set a unique task ID
            taskInfo.setTaskID(createTaskID());

            // Select task status from predefined options
            String[] options = {"To Do", "Done", "Doing"};
            int choice = JOptionPane.showOptionDialog(null, "Select Task Status:", "Task Status", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            String status = options[choice];
            taskInfo.setTaskStatus(status);

            // Display the captured task details to the user
            JOptionPane.showMessageDialog(null, "Task Status: " + taskInfo.getTaskStatus() + "\nDeveloper Details: " + taskInfo.getDeveloperDetails() + "\nTask Number: " + currentTaskNumber + "\nTask Name: " + taskInfo.getTaskName() + "\nTask Description:  " + taskInfo.getTaskDescription()  +  "\nTask ID: " + taskInfo.getTaskID() + "\nDuration: " + taskInfo.getTaskDuration() + "hrs");
        }

        // Display the total hours across all tasks
        JOptionPane.showMessageDialog(null, "Total Hours Across All Tasks: " + totalHours);
    }

    // Generates a unique task ID based on the task name, task number, and developer details.
    public static String createTaskID() {
        String firstTwoLetters = taskInfo.getTaskName().substring(0, Math.min(taskInfo.getTaskName().length(), 2)).toUpperCase();
        String lastThreeLetters = taskInfo.getDeveloperDetails().substring(Math.max(0, taskInfo.getDeveloperDetails().length() - 3)).toUpperCase();
        return firstTwoLetters + ":" + currentTaskNumber + ":" + lastThreeLetters;
    }

    // Method to reset total hours
    public static void resetTotalHours() {
        totalHours = 0;
    }

    // Method to reset task counter
    public static void resetTaskCounter() {
        currentTaskNumber = 0;
    }

    // Method to return total hours
    public static int returnTotalHours() {
        return (int) totalHours;
    }
}
//----------------------------END OF FILE----------------------------------------------//