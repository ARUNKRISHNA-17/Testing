package com.selenium.Day7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample 
{
	public WebDriver dr;
	@Test
	public void  facebook() throws InterruptedException
	{
		dr.findElement(By.name("email")).sendKeys("arunkrishnaips2003@gmail.com");
		dr.findElement(By.name("pass")).sendKeys("Arunkrishna");
		dr.findElement(By.name("login")).click();
		Thread.sleep(4000);
	}
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.get("https://www.facebook.com/");
	}
	@AfterTest
	public void aftertest()
	{
		dr.quit();
	}
}
