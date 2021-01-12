package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	
	public WebDriver driver;
	
	By profile= By.xpath("//*[@id=\"show_user_name\"]/span");
	//By signup= By.xpath("//*[@id=\"before_login\"]/div/div/div[3]/button");
	By login= By.xpath("//*[@id=\"before_login\"]/div/div/div[1]/button");
	By title= By.xpath("//*[@id=\"side_menu\"]/div/ul[1]/li[1]/h4");
	
	
	
	
	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}


	public WebElement getProfile()
	{
		return driver.findElement(profile);
	}
	
/*	public WebElement getSignup()
	{
		return driver.findElement(signup);
	}
	*/
	
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
	
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}

	
	
	
	
	
}
