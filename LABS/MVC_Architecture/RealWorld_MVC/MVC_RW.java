
package main;

import View.TaskView;
import controller.TaskController;
import model.Task;


public class MVC_RW {

    public static void main(String[] args) {
        // Create the model (task)
        Task task = new Task("Complete Homework");

        // Create the view (task view)
        TaskView taskView = new TaskView();

        // Create the controller (task controller)
        TaskController taskController = new TaskController(task, taskView);

        // Initially display the task
        taskController.updateView();

        // Modify the task using the controller
        taskController.setTaskName("Read a book");

        // Display the updated task
        taskController.updateView();
    }
    
}
