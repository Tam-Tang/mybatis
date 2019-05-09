package com.neo.mapper;

import java.util.List;

import com.neo.model.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	List<User> getAll();

	@Select("select * FROM users WHERE id = #{id}")
	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}