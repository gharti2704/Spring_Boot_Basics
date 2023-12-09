package com.spring_boot_basics.learn_database.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

    public void insertCourse() {
        String INSERT_QUERY = """
                INSERT INTO course(id, name, author)
                VALUES(1, 'Spring boot basics', 'Raju');
                """;
        jdbcTemplate.update(INSERT_QUERY);
	}

}
