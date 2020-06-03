package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class demo1 {
	
	@AfterTest
	public void lastexecution() {
		System.out.println("print at last");
	}


	@Test
	public void demo() {
		// TODO Auto-generated method stub
  System.out.println("hello");
	Assert.assertTrue(false);

	}
	

	
	@Test
	public void secondtest(){
		System.out.println("bye");
		
	}

}
