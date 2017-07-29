package com.ci.Display;

import org.junit.BeforeClass;



/**
 * Unit test for simple App.
 */
public class AppTest {
	private App app;
	@BeforeClass
	public void init(){
		app=new App();
	}
	@org.junit.Test
	public void displayTest(){
		app.display();
	}
}