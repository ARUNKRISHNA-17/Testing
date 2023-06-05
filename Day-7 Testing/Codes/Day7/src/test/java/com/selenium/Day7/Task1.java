package com.selenium.Day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Task1 
{
	public WebDriver dr;
  @Test
  public void check() 
  {
	  String title="Guest Registration Form – User Registration";
	  String ctitle=dr.getTitle();
	  Assert.assertEquals(title, ctitle);
  }
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  dr= new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  dr.quit();
  }

}
