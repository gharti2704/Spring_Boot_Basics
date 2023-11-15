package com.spring_boot_basics.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> getCourses()
	{
		return Arrays.asList(
				new Course(1, "Learn Spring Boot", "Raju"),
				new Course(2, "Spring Boot Basics", "Magar"),
				new Course(3, "Spring Boot Starter", "Raju")
				);
	}

}
