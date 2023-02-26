package com.example.jpademo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpademo.entity.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

	Course findByName(String string);

	Course findByAuthor(String string);

	

}
