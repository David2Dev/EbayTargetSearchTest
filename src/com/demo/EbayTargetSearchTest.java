package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTargetSearchTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\David-Net Engineer\\Documents\\Chrome Driver 93\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		
	    driver.get("http://target.com");
	    driver.findElement(By.id("search")).sendKeys("iphone");
	    driver.findElement(By.xpath("//*[@id=\"headerMain\"]/div[1]/form/button[2]")).click();
	    
	}

}
