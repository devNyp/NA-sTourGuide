package com.erp.nyp;

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

import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:root-context.xml")
@Log4j
public class TestDb {


	@Autowired
	SqlSessionFactory sqlSessionFactory;
	@Autowired
	HikariDataSource dataSource ;
	
	@Test
	public void testDataSource() {
		
		assertNotNull(dataSource);
	}
	
	@Test
	public void testSession() throws SQLException {
		SqlSession session = sqlSessionFactory.openSession();
		assertNotNull(session);
		Connection con = session.getConnection();
		assertNotNull(con);
		
		con.close();
	}
	
}
