package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class enabledtest {
	WebDriver driver;
	
  @Test
  public void flipkartopen() throws InterruptedException {
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(5000);
	//  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).click();
	  System.out.println("logining into flipkart");
	  driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7013324339");
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).click();
	  
  }
  @Test (priority=0)
  public void facebookopen() {
	  driver.navigate().to("https://www.netflix.com/browse");
	  System.out.println("welcome to netflix");
	  
	  
	 
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
