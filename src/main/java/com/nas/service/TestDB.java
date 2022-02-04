package com.nas.service;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context-root.xml")
public class TestDB {

	@Autowired
	SqlSessionFactory sesseion;
	
//	@Test
	public void testDb1() {
		assertNotNull(sesseion);
	}
}
