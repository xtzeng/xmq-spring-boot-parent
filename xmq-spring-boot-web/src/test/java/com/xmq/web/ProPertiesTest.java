package com.xmq.web;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.xmq.Application;
import com.xmq.util.XmqProperties;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
public class ProPertiesTest {

	
	@Autowired
    private XmqProperties neoProperties;


    @Test
    public void getHello() throws Exception {
    	System.out.println(neoProperties.getTitle());
        Assert.assertEquals(neoProperties.getTitle(), "xmq");
        Assert.assertEquals(neoProperties.getDescription(), "xiaomeiqiu");
    }

    
    @Test
    public void testMap() throws Exception {
    	Map<String, Long> orderMinTime=new HashMap<String, Long>();
    	long xx=orderMinTime.get("123");
    }

}