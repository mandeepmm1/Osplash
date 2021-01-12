package Osplash.Assignment;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.Landingpage;
import Pageobjects.Login;
import Pageobjects.Signup;

public class Homepage extends base{
	

	@Test(dataProvider="getData")
	
	public void Homepage(String username, String pwd) throws IOException
	{
		
		driver=initializeDriver();
		String urlname= prop.getProperty("url");
		System.out.println(urlname);
		driver.get(urlname);
		
		Landingpage lp= new Landingpage(driver);
		lp.getProfile().click();
		
		/*
		lp.getSignup().click();
		Signup s= new Signup(driver);
		s.name().sendKeys("mandeep");
		s.email().sendKeys("mandeepmm08@gmail.com");
		s.password().sendKeys("Password123#");
		s.submit().click();
		
	*/
		
	    lp.getlogin().click();
		Login l= new Login(driver);
		l.email().sendKeys(username);
		l.password().sendKeys(pwd);
		l.submit().click();
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[2][2];
		
		data[0][0]= "mandeepmm08@gmail.com";
		data[0][1]= "Password123#";
				
		data[1][0]= "mandeepmm08@gmail.com";
		data[1][1]= "Password123#";
		
		return data;
		
		
	}
	
	
}
