package com.spring_boot_basics.learn_jpa_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static String INSERT_QUERY = 
			"""
				INSERT INTO courses(id, name, author)
				VALUES(1, 'Spring boot basics', 'Raju');
			""";
	
	public void insertCourse()
	{
		jdbcTemplate.update(INSERT_QUERY);
	}

}
