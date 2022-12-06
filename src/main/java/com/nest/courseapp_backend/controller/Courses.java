package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nest.courseapp_backend.model.Course;

import java.util.List;


@RestController
public class Courses {
    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String addCourse(@RequestBody Course c)
    {
        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        return "Adding course successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Course> viewCourse()
    {
        return (List<Course>) dao.findAll();
    }

}
