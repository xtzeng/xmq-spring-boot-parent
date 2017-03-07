package com.xmq.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xmq.rabbit.many.XmqSender;
import com.xmq.rabbit.many.XmqSender2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
	@Autowired
	private XmqSender xmqSender;

	@Autowired
	private XmqSender2 xmqSender2;

	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<100;i++){
			xmqSender.send(i);
		}
	}

	@Test
	public void manyToMany() throws Exception {
		for (int i=0;i<100;i++){
			xmqSender.send(i);
			xmqSender2.send(i);
		}
	}

}