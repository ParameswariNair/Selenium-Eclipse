package webuniversitypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paru\\Desktop\\AutomationTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
	     driver.manage().window().maximize();
	     
	     WebElement Firstname = driver.findElement(By.name("first_name"));
	     Firstname.sendKeys("Firstname");
	        
	     WebElement Lastname = driver.findElement(By.name("last_name"));
	     Lastname.sendKeys("Lastname");
	     
	     WebElement Email = driver.findElement(By.name("email"));
	     Email.sendKeys("abc@gmail.com");
	     
	     WebElement Comments = driver.findElement(By.name("message"));
	     Comments.sendKeys("this is a comment");
	     
	     WebElement submit = driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)"));
	     submit.click();
	     	

	}

}
