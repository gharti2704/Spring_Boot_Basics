package com.spring_boot_basics.learn_database.jpa;

import com.spring_boot_basics.learn_database.jdbc.CourseJDBCRepository;
import com.spring_boot_basics.learn_spring_boot.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {

		//Inserting course entity
		repository.save(new Course(1L, "Learn aws", "Raju"));
		repository.save(new Course(2L, "Learn docker", "Magar"));
		repository.save(new Course(3L, "Learn k8", "Raju"));
		repository.save(new Course(4L, "Learn rdbms", "Raju"));

		//Deleting entity
		repository.deleteById(3L);

		//Find by author
		List<Course> courses = repository.findByAuthor("Raju");
		System.out.println(courses);

		//Updating entity
		Course course = repository.findById(2L).orElseThrow(() -> new RuntimeException("No entity found"));;
		course.setName("Learn spring jpa");
		course.setAuthor("Maya");
		repository.save(course);
	}

}
