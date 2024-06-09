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
//	     Draggable and droppable
	     
//	     driver.switchTo().frame(0);
	     WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	     WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	       
	        //action method created
	      Actions ac = new Actions(driver);
//	      ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
	      ac.dragAndDrop(sourceElement, targetElement).build().perform();

	      /*Double click*/
	      Thread.sleep(2000);  
	      WebElement link = driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
	      ac.doubleClick(link).perform();
	      
	      /*hover me first*/
	      Thread.sleep(2000);  

	      
	      WebElement Hoverfirst = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
	      ac.moveToElement(Hoverfirst).build().perform();
	      WebElement link1 = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a"));
	      link1.click();
		  Thread.sleep(2000);   
		  Alert alert = driver.switchTo().alert();     
		  alert.accept();
		  Thread.sleep(2000);
		  
		  //Click & hold
		   WebElement Holdclick = driver.findElement(By.id("click-box"));
		   ac.clickAndHold(Holdclick).perform();
		   Thread.sleep(2000);
		   ac.release(Holdclick);
		   
		   driver.quit();

		  
	}

}
