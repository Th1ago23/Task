package com.javaproject.tasks.controllers;

import com.javaproject.tasks.model.Task;
import com.javaproject.tasks.repository.TaskRepository;
import com.javaproject.tasks.repository.UserRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public ResponseEntity<String> getTasks() {
        return ResponseEntity.ok(taskRepository.findAll().toString());
    }

}
