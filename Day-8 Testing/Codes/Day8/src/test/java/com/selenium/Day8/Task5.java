package com.selenium.Day8;

import java.util.Set;

import org.openqa.selenium.Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Asphalt");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String t1=driver.getTitle();
		String i1=driver.getWindowHandle();
		System.out.println(t1);
		System.out.println(i1);
		//2nd tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Call of Duty");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String t2=driver.getTitle();
		String i2=driver.getWindowHandle();
		System.out.println(t2);
		System.out.println(i2);
		//3rd tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Fortnite");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String t3=driver.getTitle();
		String i3=driver.getWindowHandle();
		System.out.println(t3);
		System.out.println(i3);
		
		Set<String>s=driver.getWindowHandles();
		System.out.println("Number of Tabs opened: "+s.size());
	}

}
