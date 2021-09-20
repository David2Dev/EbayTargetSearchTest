package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//invoke exe file
	//	 System.setProperty("webdriver.chrome.driver",  "C:\Users\David-Net Engineer\Documents\chromedriver_win32\chromedriver.exe" );
		
		//selenium code - 
		//Create Driver object - you have to create one per browser. One for Chrome, FireFox, Edge
		//Chrome Object
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\David-Net Engineer\\Documents\\Chrome Driver 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());  //validate if your page title is correct
		System.out.println(driver.getCurrentUrl());  //vlaidate if you are on the correct url
		
		//we can also navigate to another page
		driver.get("http://yahoo.com");
		//then if you want to go back to google you would do
		driver.navigate().back();
		
		//When you need to close your application 
		//driver.quit will close all browsers opened by selenium 
		driver.quit();  
		//driver.close will only close your current browser
		
		
	}

}
