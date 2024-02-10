package com.example.todoapp.services;

import com.example.todoapp.models.Task;
import com.example.todoapp.repositories.TaskRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createNewTask(Task task){
        return taskRepository.save(task);
    }
    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }
    public Task findTaskById(Long id){
        return taskRepository.getById(id);
    }

    public List<Task> findAllCompletedTask(){
        return taskRepository.findByCompletedTrue();
    }
    public List<Task> findAllInCompletedTask(){
        return taskRepository.findByCompletedFalse();
    }
    public void deleteTask(Task task){
        taskRepository.delete(task);
    }
    public Task updateTask(Long id,Task task){

//        System.out.println("tasks"+task);
        Task  existingTask=taskRepository.getById(id);
        BeanUtils.copyProperties(task,existingTask,"id");
        return taskRepository.save(existingTask);
    }






}
