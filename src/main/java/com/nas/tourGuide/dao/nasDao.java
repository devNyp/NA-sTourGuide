package com.nas.tourGuide.dao;

import java.util.List;

public interface nasDao {
	public <T> void insert(T t);
	public <T> T selectOn(String id);
	public <T, K> List<T> selectAll(K k);
	public <T> void update(T t);
	public void delete(String id);
	
}
