package com.nas.tourGuide.test;

import static org.junit.Assert.assertNotNull;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nas.dao.NasDao;
//import com.nas.dao.TestDao;
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context-root.xml")@Log4j
public class TestDb {


	@Autowired
	SqlSessionFactory sqlSessionFactory;
	@Autowired
	HikariDataSource dataSource ;
	@Autowired
	NasDao dao;
	
//	@Test
//	public void testDataSource() {		
//		assertNotNull(dataSource);
//	}
//	
//	@Test
//	public void testSession() throws SQLException {
//		SqlSession session = sqlSessionFactory.openSession();
//		assertNotNull(session);
//		Connection con = session.getConnection();
//		assertNotNull(con);
//		
//		con.close();
//	}
	
	@Test
	public void getTime() {
		System.out.println(dao.time());
	}
	
}
