package actionsinwebpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class actionclass {
	WebDriver driver;
	
  @Test
  public void mousehovers() throws Exception{
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();	 
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Login']"))).perform();
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/header/div[2]/div[2]/div/div/div/ul/a[10]/li/div/div/div")).click();
	  
  }
  @Test
  public void keyboardenterrightclick() throws Exception{
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/header/div[1]/div[1]/form/div/div/input")).sendKeys("mobile");
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"))).build().perform();
	  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
