package com.pws.springbootswagger.service;

import com.pws.springbootswagger.dao.CourseRepository;
import com.pws.springbootswagger.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    public String saveCourse(Course course) {
        repository.save(course);
        return "saved Course with id" + course.getCourseId();
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public List<Course> deleteCourseBuId(int courseId) {
        repository.deleteById(courseId);
        return repository.findAll();
    }
}