package com.nas.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface NasDao {
	public <T> void insert(T t);
	public <T> T selectOne(String id);
	public <T, K> List<T> selectAll(K k);
	public <T> void update(T t);
	public void delete(String id);
	public String time();
	
}
