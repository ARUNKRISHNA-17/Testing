package com.selenium.Day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest 
{	
	WebDriver wd = new ChromeDriver();
	@Test(dependsOnMethods = {"beforeTest"})
	  public void facebook() throws InterruptedException 
	  {
		  	wd.findElement(By.name("email")).sendKeys("arunkrishnaips2003@gmail.com");
			wd.findElement(By.name("pass")).sendKeys("Arunkrishna");
			wd.findElement(By.name("login")).click();
			Thread.sleep(4000);
	  }
	  @Test
	  public void beforeTest() 
	  {
		  	WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
			
			wd.manage().window().maximize();
			wd.get("https://www.facebook.com/");
	  }
	
	  @Test
	  public void afterTest() 
	  {
		  wd.quit();
	  }

}