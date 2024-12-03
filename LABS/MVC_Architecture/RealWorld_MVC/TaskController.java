package controller;

import View.TaskView;
import model.Task;

public class TaskController {
    private Task model;
    private TaskView view;

    // Constructor
    public TaskController(Task model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    // Method to update the view
    public void updateView() {
        view.printTaskDetails(model.getTaskName());
    }

    // Method to set task data
    public void setTaskName(String taskName) {
        model.setTaskName(taskName);
    }
}
