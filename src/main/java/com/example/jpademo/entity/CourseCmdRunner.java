package com.example.jpademo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpademo.repo.CourseRepo;
@Component
public class CourseCmdRunner implements CommandLineRunner {
	@Autowired
	private CourseRepo repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Course(1, "AWS","VK"));
		repo.save( new Course(2, "Devops","DK"));
		repo.save(new Course(3,"SpringBoots","VV"));
		System.out.println(repo.findById(2));
		repo.deleteById(3);
		System.out.println(repo.findByName("AWS"));
		System.out.println(repo.findByAuthor("DK"));

	}

}
