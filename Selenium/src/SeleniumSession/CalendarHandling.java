package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// dynamic wait
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
for(WebElement el:allDates) {
	String date = el.getText();
	if(date.equalsIgnoreCase("10")) {
		
		el.click();
		break;
	}
	}
	}
}
