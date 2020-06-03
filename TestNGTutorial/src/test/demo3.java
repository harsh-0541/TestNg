package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo3 {
	
	
	@Test(groups= {"smoke"})
	public void MobileLogincarLoan()
	{
		System.out.println("Mobile car loan");
	}
	@Parameters({"URL"})
	@Test
	public void harsha(String urlname)
	{
		System.out.println(" carloan");
		System.out.println(urlname);
	}
	
	@BeforeMethod
	public void BfMethod() {
		System.out.println("i will execute before everything for harsh vardhan singh");
	}
	
	@AfterMethod
	public void AfMethod() {
		System.out.println("i will execute after everything for harsh vardhan singh");
	}
@Test(dataProvider="getData")
 public void APIlogincar(String username,String password)
 {
	 System.out.println("execution of test caes with multiple data");
	 System.out.println(username);
	 System.out.println(password);
 }
@DataProvider
public Object[][] getData() {
	Object [][] data=new Object[3][2];
	
	data[0][0]="Firstset username";
	data[0][1]="password1";
	data[1][0]="secondset username";
	data[1][1]="password2";
	data[2][0]="thirdset username";
	data[2][1]="password3";
	return data;
	}
}
