package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class iframesmethods {
	WebDriver driver;
  @Test
  public void iframesclick() throws Exception {
	  driver.get("https://seleniumbase.io/w3schools/iframes");
	  Thread.sleep(2000);
	  WebElement frame=driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  driver.switchTo().frame(frame);
	  WebElement frame2=driver.findElement(By.xpath("/html/body/iframe"));
	  driver.switchTo().frame(frame2);
	  driver.findElement(By.xpath("//a[normalize-space()='seleniumbase.io/w3schools/iframes']")).click();
	 // driver.switchTo().parentFrame();
	  Thread.sleep(5000);
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	  
	  
	  
  }
  
  @Test
  public void iframesclicknew() throws Exception {
	  driver.get("https://seleniumbase.io/w3schools/iframes");
	  Thread.sleep(2000);
	  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
	//  Thread.sleep(2000);
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"./demo_iframe.htm\"]")));
	//  Thread.sleep(2000);
	//  driver.switchTo().frame(1);
		 Thread.sleep(2000);

	 driver.findElement(By.xpath("//a[normalize-space()='seleniumbase.io/w3schools/iframes']")).click();
	  
	 driver.switchTo().defaultContent();
	 

	 driver.findElement(By.xpath("//button[@id='runbuttn']")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
