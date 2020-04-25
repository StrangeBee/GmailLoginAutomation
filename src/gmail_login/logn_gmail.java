package gmail_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logn_gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("oduolatemmy@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Temmybentee");
	}
	
}
