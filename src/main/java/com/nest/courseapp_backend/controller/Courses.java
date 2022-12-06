package com.nest.courseapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nest.courseapp_backend.model.Course;


@RestController
public class Courses {
    @GetMapping("/")
    public String viewCourse()
    {
        return "viewing course page";
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String addCourse(@RequestBody Course c)
    {
        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        return "Adding course successfully";
    }

}
