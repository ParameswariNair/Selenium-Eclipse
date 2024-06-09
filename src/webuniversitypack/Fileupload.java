package webuniversitypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\paru\\Desktop\\AutomationTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/File-Upload/index.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
         // Locate the file input element
         WebElement fileInput = driver.findElement(By.id("myFile"));
         // Upload the file by sending the file path to the file input element
         fileInput.sendKeys("C:\\Users\\paru\\Desktop\\AutomationTesting\\web driver git token.txt");
         
         Thread.sleep(2000);
         
         WebElement submit = driver.findElement(By.id("submit-button"));
         submit.click();
         Thread.sleep(2000);

         Alert alert = driver.switchTo().alert();     
		 alert.accept();
         Thread.sleep(2000);

		 
		 driver.quit();

         
	}

}
