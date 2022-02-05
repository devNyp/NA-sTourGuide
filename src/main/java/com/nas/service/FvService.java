package com.nas.service;

import java.util.List;

public interface FvService {

	<T> List<T> getAll(String page, String location);

}
