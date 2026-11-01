
package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class GetAllCoursesController {

    private final CourseService courseService;

    // Constructor injection
    public GetAllCoursesController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Get all courses
    @GetMapping
    public List<Course> getAllCourses() {

        return courseService.getAllCourses();
    }
}
