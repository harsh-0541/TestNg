package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo4 {
	@Parameters({"URL"})
	@Test
	public void webloginhome(String URlname)
	{
		System.out.println("personal loan home");
		System.out.println(URlname);
	}
	
	@Test(groups= {"smoke"})
 public void mobileloginhome()
 {
	 System.out.println("login of car home mobile");
 }
}

