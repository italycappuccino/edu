/**
 * @Project: edu
 * @Author: Peter
 * @Date: Sep 14, 2014
 * www.italycappuccino.com italycappuccino@gmail.com
 * 
 * @Copyright: 3Stock Inc. All rights reserved.
 */
package com.stock.core.manager;

import lombok.Data;

import com.stock.core.service.impl.Bird;

/**
 * @author Peter
 * @create Sep 14, 2014
 */
@Data
public class Woodpecker extends Bird {
	
	private int birdId;
	private String birdName;
	
	@Override
	public void info(){
		System.out.println("this is a woodpecker.");
		System.out.println("its name:"+birdName);
		System.out.println("ID:"+birdId);
	}

}
