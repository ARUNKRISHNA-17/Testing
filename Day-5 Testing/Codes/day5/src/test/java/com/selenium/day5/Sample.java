package com.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://teacherrecords.neohire.io/admin/index.php");
		
		wd.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/input")).sendKeys("admin");
		wd.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/input")).sendKeys("Test@123");
		wd.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
		
		WebElement wwe =  wd.findElement(By.xpath("//*[@id=\'right-panel\']/div[2]/a[1]/div/div/div/h2"));
		Thread.sleep(7000);
		System.out.println("Listed Subjects : "+wwe.getText());
		System.out.println("Total Registered Teachers : "+wwe.getText());
		System.out.println("Profile not public : "+wwe.getText());
		System.out.println("Profile Public : "+wwe.getText());
	}
}
