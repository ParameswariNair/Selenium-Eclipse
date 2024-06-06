package webuniversitypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paru\\Desktop\\AutomationTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Click-Buttons/index.html");
		
		driver.manage().window().maximize();
		
		WebElement WebelementClick = driver.findElement(By.id("button1"));
		WebelementClick.click();
	    Thread.sleep(2000);
		WebElement Popupbox = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
	    Popupbox.click();
	    Thread.sleep(2000);
	    
	    WebElement JavascriptClick = driver.findElement(By.id("button2"));
	    JavascriptClick.click();
	    Thread.sleep(2000);
	    WebElement Popupbox2 = driver.findElement(By.xpath("//*[@id=\"myModalJSClick\"]/div/div/div[3]/button"));
	    Popupbox2.click();
	    Thread.sleep(2000);
	    
	    WebElement ActionmoveClick = driver.findElement(By.id("button3"));
	    ActionmoveClick.click();
	    Thread.sleep(2000);
	    WebElement Popupbox3 = driver.findElement(By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button"));
	    Popupbox3.click();
	    Thread.sleep(2000);
	    
	   
	    		

	}

}
