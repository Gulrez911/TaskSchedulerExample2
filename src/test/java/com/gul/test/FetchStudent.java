package com.gul.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.gul.config.AppConfig;
import com.gul.config.JpaConfig;
import com.gul.entity.Student;
import com.gul.repo.StudentRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { JpaConfig.class, AppConfig.class })
public class FetchStudent {

	@Autowired
	StudentRepository repository;

	@Test
	@Transactional
	@Rollback(true)
	public void testAddDepartment() {
		List<Student> li = repository.findAll();
		System.out.println("List: " + li);
	}
}
