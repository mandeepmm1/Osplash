package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {

	
public WebDriver driver;
	
	By name= By.id("reg_name");
	By email= By.id("reg_email");
	By password= By.id("reg_password");
	By submit= By.id("register_btn");
	
	
	
	public Signup(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}


	public WebElement name()
	{
		return driver.findElement(name);
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
}
