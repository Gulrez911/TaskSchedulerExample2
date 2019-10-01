package com.gul.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.gul.config.JpaConfig;
import com.gul.entity.Student;
import com.kgate.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class)
@WebAppConfiguration
public class FetchStudent {

	@Autowired
	StudentService service;

	@Test
	public void testAddDepartment() {
		List<Student> li = service.findAll();
		for (Student student : li) {
			System.out.println("List: " + student.getFname());
			System.out.println("List: " + student.getLname());
			System.out.println("List: " + student.getEmail());
		}
	}
}
