package webuniversitypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paru\\Desktop\\AutomationTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html");
	     driver.manage().window().maximize();
	     
	     WebElement user = driver.findElement(By.id("text"));
	     user.click();
	     WebElement username = driver.findElement(By.id("text"));
	     username.sendKeys("Abcd");
	     
	     WebElement pass = driver.findElement(By.id("password"));
	     pass.click();
	     WebElement password = driver.findElement(By.id("password"));
	     password.sendKeys("pass123");
	     
	     WebElement submit = driver.findElement(By.id("login-button"));
	     submit.click();
	     
	     Alert alert = driver.switchTo().alert();     
	     Thread.sleep(2000);
	     alert.accept();
	     

	}

}
