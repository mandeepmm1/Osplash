package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

public WebDriver driver;
	
	By email= By.id("email");
	By password= By.id("password");
	By submit= By.id("login_btn");
	
	
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
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
