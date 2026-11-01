
package com.example.demo.controller;

import com.example.demo.service.CourseService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
public class DeleteCourseController {

    private final CourseService courseService;

    public DeleteCourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Delete course
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(
            @PathVariable Long id) {

        boolean deleted = courseService.deleteCourse(id);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
