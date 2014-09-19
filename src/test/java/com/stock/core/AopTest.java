/**
 * @Project: edu
 * @Author: Peter
 * @Date: Sep 14, 2014
 * www.italycappuccino.com italycappuccino@gmail.com
 * 
 * @Copyright: 3Stock Inc. All rights reserved.
 */
package com.stock.core;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import javax.annotation.Resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stock.core.manager.LogHandler;
import com.stock.core.service.Animal;

/**
 * @author Peter
 * @create Sep 14, 2014
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:appContext.xml")
public class AopTest extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private Animal woodpecker;
	@Resource
	private LogHandler logHandler;
	
	@Test
	public void mm(){
		logHandler.setObj(woodpecker);
		Animal animalProxy = (Animal) Proxy.newProxyInstance(woodpecker.getClass().getClassLoader(), new Class[]{Animal.class}, logHandler);
		animalProxy.info();
	}
	
	@Test
	public void tt(){
		woodpecker.info();
	}

}
