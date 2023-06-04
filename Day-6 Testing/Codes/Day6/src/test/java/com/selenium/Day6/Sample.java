package com.selenium.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.google.com");
		
		
		WebElement type=wd.findElement(By.xpath("//*[@id=\'APjFqb\']"));
		type.sendKeys("iphone");
		type.sendKeys(Keys.ENTER);
	}
}
