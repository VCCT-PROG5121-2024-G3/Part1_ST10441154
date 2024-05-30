package poe1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TasksIT {

    public TasksIT() {
    }

    @BeforeClass
    public static void setUpClass() {
        // Reset static variables before running tests
        Tasks.resetTotalHours();
        Tasks.resetTaskCounter();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkTaskDcription method, of class Tasks.
     */
    @Test
    public void testCheckTaskDcription() {
        System.out.println("checkTaskDcription");
        String validDescription = "Create Login to authenticate users";
        String invalidDescription = "This description is way too long and exceeds the fifty character limit";

        // Test valid description
        assertTrue(Tasks.checkTaskDcription(validDescription));

        // Test invalid description
        assertFalse(Tasks.checkTaskDcription(invalidDescription));
    }

    /**
     * Test of createTaskID method, of class Tasks.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        
        // Initialize task information for testing
        Tasks.taskInfo.setTaskName("Login Feature");
        Tasks.taskInfo.setDeveloperDetails("Robyn Harrison");
        
        // Generate and test TaskID
        String result = Tasks.createTaskID();
        String expResult = "LO:1:SON";
        assertEquals(expResult, result);
    }

    /**
     * Test of returnTotalHours method, of class Tasks.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        
        // Reset and add tasks
        Tasks.resetTotalHours();
        Tasks.resetTaskCounter();
        Tasks.taskInfo.setTaskDuration(8);
        Tasks.totalHours += 8;
        Tasks.taskInfo.setTaskDuration(10);
        Tasks.totalHours += 10;
        
        int expResult = 18;
        int result = Tasks.returnTotalHours();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of task method, of class Tasks.
     * Note: This test simulates adding tasks without actual user input
     */
    @Test
    public void testTask() {
        System.out.println("task");
        
        // Reset total hours and task counter
        Tasks.resetTotalHours();
        Tasks.resetTaskCounter();
        
        // Simulate task addition
        int numTasks = 2;
        Tasks.taskInfo.setTaskNumber(numTasks);

        // Add task 1
        Tasks.taskInfo.setTaskName("Login Feature");
        Tasks.taskInfo.setTaskDescription("Create Login to authenticate users");
        Tasks.taskInfo.setDeveloperDetails("Robyn Harrison");
        Tasks.taskInfo.setTaskDuration(8);
        Tasks.totalHours += 8;
        Tasks.taskInfo.setTaskStatus("To Do");

        // Add task 2
        Tasks.taskInfo.setTaskName("Add Task Feature");
        Tasks.taskInfo.setTaskDescription("Create Add Task feature to add task users");
        Tasks.taskInfo.setDeveloperDetails("Mike Smith");
        Tasks.taskInfo.setTaskDuration(10);
        Tasks.totalHours += 10;
        Tasks.taskInfo.setTaskStatus("Doing");

        // Check total hours
        int expTotalHours = 18;
        int resultTotalHours = Tasks.returnTotalHours();
        assertEquals(expTotalHours, resultTotalHours);
    }
}
