
package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
public class UpdateCourseController {

    private final CourseService courseService;

    public UpdateCourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Update course
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(
            @PathVariable Long id,
            @RequestBody Course course) {

        return courseService.updateCourse(id, course)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
