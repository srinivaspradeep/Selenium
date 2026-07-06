package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class ExecutionOrder {
	WebDriver driver;
	

  @Test
	public void zomato() {
		driver.get("https://www.zomato.com");
		
	}
	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void Swiggy() {
		driver.get("https://www.swiggy.com");
	}
	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}
  @BeforeSuite
  public void beforeSuite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
