package com.example.todo_task.controller;

import com.example.todo_task.model.Task;
import com.example.todo_task.model.TaskStatus;
import com.example.todo_task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // Create task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // Get all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // Delete task
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

    // Move task to a different stage (status)
    @PostMapping("/{id}/move")
    public Task moveTask(@PathVariable Long id, @RequestParam String status) {
        TaskStatus newStatus = TaskStatus.valueOf(status.toUpperCase());
        return taskService.updateStatus(id, newStatus);
    }
}
