/**
 * @Project: edu
 * @Author: Peter
 * @Date: Sep 14, 2014
 * www.italycappuccino.com 
 * italycappuccino@gmail.com
 * @Copyright: 3Stock Inc. All rights reserved.
 */
package com.stone.core;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stone.core.manager.LogHandler;
import com.stone.core.manager.Woodpecker;
import com.stone.core.service.Animal;

/**
 * @author Peter
 * @create Sep 14, 2014
 */
public class IocTest {

    @Test
    public void test() {
        //		fail("Not yet implemented");
        BeanFactory beanFactory = null;
        try {
            beanFactory = new ClassPathXmlApplicationContext("classpath*:/appContext.xml");
            Animal animal = (Woodpecker) beanFactory.getBean("woodpecker");
            LogHandler logHandler = (LogHandler) beanFactory.getBean("logHandler");
            logHandler.setObj(animal);
            Animal animalProxy = (Animal) Proxy.newProxyInstance(animal.getClass().getClassLoader(),
                    new Class[] { Animal.class }, logHandler);
            animalProxy.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("resource")
    @Test
    public void mm() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath*:/appContext.xml");
        Animal animal = (Animal) beanFactory.getBean("woodpecker");
        animal.info();
    }

}
