package com.nest.courseapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Courses {
    @GetMapping("/")
    public String viewCourse()
    {
        return "viewing course page";
    }
    @PostMapping("/add")
    public String addCourse()
    {
        return "Adding course successfully";
    }

}
