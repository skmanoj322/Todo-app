package com.example.todoapp.controllers;

import com.example.todoapp.models.Task;
import com.example.todoapp.services.TaskService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping("/")
    public ResponseEntity<List<Task>>getAllTask(){
        return ResponseEntity.ok(taskService.getAllTask());
    }

    @PostMapping("/")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.createNewTask(task));
    }
    @GetMapping("/completed")
    public ResponseEntity<List<Task>> completedTask(){
        return  ResponseEntity.ok(taskService.findAllInCompletedTask());
    }
    @GetMapping("/incomplete")
    public  ResponseEntity<List<Task>> incompleteTask(){
        return ResponseEntity.ok(taskService.findAllInCompletedTask());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id,@RequestBody Task task){
        task.setId(id);
        return ResponseEntity.ok(taskService.updateTask(id,task));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> getAllTask(@PathVariable Long id){
        taskService.deleteTask(taskService.findTaskById(id));
        return ResponseEntity.ok(true);
    }


}
