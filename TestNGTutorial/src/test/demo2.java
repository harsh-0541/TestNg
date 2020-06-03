package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
    @Test(groups= {"smoke"})
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("good");
    }
    @BeforeTest
    public void prerequest() {
    	System.out.println("i will execute first");
		
	}

}
