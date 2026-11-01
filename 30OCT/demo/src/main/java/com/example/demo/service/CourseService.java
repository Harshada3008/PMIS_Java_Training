
package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    // Constructor injection
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // Create course
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    // Get all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // Get course by ID
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    // Update course
    public Optional<Course> updateCourse(Long id, Course courseDetails) {

        return courseRepository.findById(id).map(existingCourse -> {

            existingCourse.setTitle(courseDetails.getTitle());
            existingCourse.setDescription(courseDetails.getDescription());

            return courseRepository.save(existingCourse);
        });
    }

    // Delete course
    public boolean deleteCourse(Long id) {

        if (!courseRepository.existsById(id)) {
            return false;
        }

        courseRepository.deleteById(id);
        return true;
    }
}
