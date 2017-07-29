package com.ci.Display;

import org.junit.BeforeClass;



/**
 * Unit test for simple App.
 */
public class AppTest {
	private static App app;
	@BeforeClass
	public static void initiate(){
		app=new App();
	}
	@org.junit.Test
	public void displayTest(){
		app.display();
	}
}