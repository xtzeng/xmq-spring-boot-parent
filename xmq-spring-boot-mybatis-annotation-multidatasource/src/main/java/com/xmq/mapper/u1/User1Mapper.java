package com.xmq.mapper.u1;

import org.apache.ibatis.annotations.*;

import com.xmq.entity.UserEntity;
import com.xmq.enums.UserSexEnum;

import java.util.List;

public interface User1Mapper {


	@Select("SELECT * FROM user")
	@Results({
			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name")
	})
	List<UserEntity> getAll();

	@Select("SELECT * FROM user WHERE id = #{id}")
	@Results({
			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
			@Result(property = "nickName", column = "nick_name")
	})
	UserEntity getOne(Long id);

	@Insert("INSERT INTO user(user_name,password,user_sex) VALUES(#{userName}, #{password}, #{userSex})")
	void insert(UserEntity user);

	@Update("UPDATE user SET user_name=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(UserEntity user);

	@Delete("DELETE FROM user WHERE id =#{id}")
	void delete(Long id);

}