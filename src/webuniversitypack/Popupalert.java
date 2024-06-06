package webuniversitypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paru\\Desktop\\AutomationTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
	     driver.manage().window().maximize();
	     
	     WebElement Javascriptalert = driver.findElement(By.id("button1"));
	     Javascriptalert.click();
	     
	     Alert alert = driver.switchTo().alert();     
	     Thread.sleep(2000);

	     alert.accept();
	     Thread.sleep(2000);
	     
	     WebElement Modalpopup = driver.findElement(By.id("button2"));
	     Modalpopup.click();
	     Thread.sleep(2000);
	     WebElement Popupbox = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button"));
	     Popupbox.click();
	     Thread.sleep(2000);
	     
	     WebElement Ajaxpopup = driver.findElement(By.id("button3"));
	     Ajaxpopup.click();
	     Thread.sleep(6000);
	     WebElement Clickme = driver.findElement(By.cssSelector("#button1"));
	     Clickme.click();
	     Thread.sleep(2000);
	     WebElement Popup = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
	     Popup.click();
	     Thread.sleep(2000);
	     
	     driver.navigate().back();
	     
	     WebElement Javascriptconfirmbox = driver.findElement(By.id("button4"));
	     Javascriptconfirmbox.click();
	     alert.dismiss();
	     Thread.sleep(2000);
	     
	     driver.quit();
	     
	     
	     
	     
	    
	     
	     

	}

}
