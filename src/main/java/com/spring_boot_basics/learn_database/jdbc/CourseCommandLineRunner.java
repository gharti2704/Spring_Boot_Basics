package com.spring_boot_basics.learn_database.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJDBCRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insertCourse();

	}

}
