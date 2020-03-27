package com.otwani.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	WebDriver driver;

	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.myntra.com/");
			searchCourse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchCourse() {
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("java");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")).click();
	}

	public static void main(String[] args) {
		Day1 myObj = new Day1();
		myObj.invokeBrowser();

	}

}
