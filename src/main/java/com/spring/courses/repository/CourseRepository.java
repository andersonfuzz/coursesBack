package com.spring.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.courses.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
