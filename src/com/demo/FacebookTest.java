package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\David-Net Engineer\\Documents\\Chrome Driver 93\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot Password?")).click();
		//driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		
		//driver.quit();
		

	}

}
