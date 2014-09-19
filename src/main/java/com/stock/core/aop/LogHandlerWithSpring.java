/**
 * @Project: edu
 * @Author: Peter
 * @Date: Sep 15, 2014
 * www.italycappuccino.com 
 * italycappuccino@gmail.com
 * @Copyright: 3Stock Inc. All rights reserved.
 */
package com.stock.core.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Peter
 * @create Sep 15, 2014
 */
@Aspect
public class LogHandlerWithSpring {
	
	@Before("execution(public void com.stock.core.manager.Woodpecker.info())")
	public void beforeMethod(){
		System.out.println("====before");
	}

}
