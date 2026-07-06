package pagescroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pagescrollupdwn {
	WebDriver driver;
	
	
  @Test
  public void pagescrolling() throws Exception{
	  driver.get("https://www.selenium.dev/");
	  driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
	 /* Actions act = new Actions(driver);
	  act.scrollByAmount(0, 1200).build().perform();*/
	  Thread.sleep(2000);
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,1950)");
	  Thread.sleep(2000); 
	  
	 
	  
	  driver.findElement(By.xpath("//a[@class='selenium-button selenium-grid text-uppercase fw-bold']")).click();
	  

	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
