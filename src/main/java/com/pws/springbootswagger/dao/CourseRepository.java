package com.pws.springbootswagger.dao;

import com.pws.springbootswagger.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {

}
