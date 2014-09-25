/**
 * @Project: edu
 * @Author: Peter
 * @Date: Sep 14, 2014
 * www.italycappuccino.com italycappuccino@gmail.com
 * 
 * @Copyright: 3Stock Inc. All rights reserved.
 */
package com.stone.core.manager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Peter
 * @create Sep 14, 2014
 */
public class LogHandler implements InvocationHandler{
	
	private Object obj;
	

	/**
	 * @return the obj
	 */
	public Object getObj() {
		return obj;
	}


	/**
	 * @param obj the obj to set
	 */
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public void beforeMethod(){
		System.out.println("enter the zoo before.");
	}
	
	public void afterMethod(){
		System.out.println("enter the zoo after.");
	}


	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		this.beforeMethod();
		method.invoke(obj, args);
		this.afterMethod();
		return null;
	}

}
