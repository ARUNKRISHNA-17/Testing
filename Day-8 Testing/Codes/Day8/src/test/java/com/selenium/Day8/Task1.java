package com.selenium.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
    	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		
		Actions a=new Actions(driver);
		WebElement source_ele=driver.findElement(By.id("draggable"));
		WebElement dest_ele=driver.findElement(By.id("droppable"));
		
		a.clickAndHold(source_ele).release(dest_ele).build().perform();
//		Thread.sleep(5000);
//		driver.quit();

	}

}
