package pagescroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class buttonclick {
	WebDriver driver;
	
  @Test
  public void buttonclickusingJS() {
	  driver.get("https://www.5movierulz.house/");

      WebElement button = driver.findElement(By.xpath("//a[@title='Malayalam Movies']"));

      JavascriptExecutor js = (JavascriptExecutor) driver;

      js.executeScript("arguments[0].click();", button);

	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
  

}
