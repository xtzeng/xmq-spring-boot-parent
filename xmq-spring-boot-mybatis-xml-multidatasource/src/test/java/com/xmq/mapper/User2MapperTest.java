package com.xmq.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xmq.entity.UserEntity;
import com.xmq.enums.UserSexEnum;
import com.xmq.mapper.u2.User2Mapper;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class User2MapperTest {

	@Autowired
	private User2Mapper userMapper;

	@Test
	public void testInsert() throws Exception {
		userMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
		userMapper.insert(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
		userMapper.insert(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));

		Assert.assertEquals(3, userMapper.getAll().size());
	}

	@Test
	public void testQuery() throws Exception {
		List<UserEntity> users = userMapper.getAll();
		if(users==null || users.size()==0){
			System.out.println("is null");
		}else{
			System.out.println(users.toString());
		}
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		UserEntity user = userMapper.getOne(6l);
		System.out.println(user.toString());
		user.setNickName("xmq");
		userMapper.update(user);
		Assert.assertTrue(("xmq".equals(userMapper.getOne(6l).getNickName())));
	}

}