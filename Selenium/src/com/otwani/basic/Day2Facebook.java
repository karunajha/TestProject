package com.otwani.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day2Facebook {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.25.0-win64\\geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("firstname")).sendKeys("karuna");
//		driver.findElement(By.name("lastname")).sendKeys("jha");
		//driver.findElement(By.xpath("//*[@id=\"u_0_z\"]")).sendKeys("a@a.com");
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement day_d = driver.findElement(By.id("day"));
		Select oSelect = new Select(day_d);
		Thread.sleep(3000);
		oSelect.selectByIndex(6);
		
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		Thread.sleep(3000);

		month1.selectByVisibleText("Jan");
		WebElement year_y = driver.findElement(By.id("year"));
		Select year_yq = new Select(year_y);
		Thread.sleep(3000);
		year_yq.selectByValue("2000");
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"u_0_1b\\\"]")));
	//	driver.findElement(By.xpath("//*[@id=\"u_0_1b\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		driver.navigate().back();
	}
}
