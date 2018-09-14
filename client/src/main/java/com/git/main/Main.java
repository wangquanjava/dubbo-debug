/**
 * 
 */
package com.git.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class Main {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { 
				"spring/applicationContext.xml",
				"spring/applicationContext-mybatis.xml",
				"spring/applicationContext-dubbo.xml"
				});
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}

}
