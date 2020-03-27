package co.edureka.selenium.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		if (text.equals("Please enter a valid username")) {

		} else {
			System.out.println("incorrect alert message");
		}
		alert.accept();// click on OK button
		// alert.dismiss();//click on cancel button

	}
}
