package com.xmq.mapper.u2;

import java.util.List;

import com.xmq.entity.UserEntity;


public interface User2Mapper {
	
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}