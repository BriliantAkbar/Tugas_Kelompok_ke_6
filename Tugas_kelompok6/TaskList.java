package Tugas_kelompok6;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;
    
    public TaskList(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void deleteTask(Task task) {
        tasks.remove(task);
    }

    public void displayTask() {
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
    }
}
