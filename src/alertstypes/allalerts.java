package alertstypes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allalerts {
	WebDriver driver;
	Alert alt;
	
  @Test
  public void simplealert() throws Exception {
	  
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(2000); 
	  driver.switchTo().alert().accept();
			  
  }
  @Test
  public void simplealertcancel() throws Exception {
	  
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(2000); 
	  alt=driver.switchTo().alert();
	  alt.dismiss();
  }
  @Test
  public void promptalert() throws Exception {
	  
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(2000); 
	  driver.switchTo().alert().sendKeys("Srinivasa");
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
  

}
