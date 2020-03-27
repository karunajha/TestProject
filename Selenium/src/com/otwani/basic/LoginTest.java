package com.otwani.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/"); // open brower
		
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();

		String exp_title = "Welcome: Mercury Tours";
		String act_title = driver.getTitle(); // return title of the page
//System.out.println(act_title);
		if (exp_title.equals(act_title) == true) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test is failed");
		}
		driver.close(); //close the browser
	}

}
