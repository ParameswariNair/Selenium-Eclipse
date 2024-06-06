package webuniversitypack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paru\\Desktop\\AutomationTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.webdriveruniversity.com/Actions/index.html");
	     driver.manage().window().maximize();
	     Thread.sleep(5000);
	     /*Draggable and droppable*/
	     
	     driver.switchTo().frame(0);
	     WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
	     WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	       
	        //action method created
	      Actions ac = new Actions(driver);
	      ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
	      /*Double click*/
	      Thread.sleep(2000);  
	      WebElement link = driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
	      ac.doubleClick(link).perform();
	      
	      /*hover popup*/
	      
	      WebElement Hoverfirst = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
	      Hoverfirst.click();
		     
		  Alert alert = driver.switchTo().alert();     
		  Thread.sleep(2000);

		  alert.accept();
		  Thread.sleep(2000);
	}

}
