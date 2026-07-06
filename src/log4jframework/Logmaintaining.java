package log4jframework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logmaintaining {
	WebDriver driver;
  @Test
  public void f() {
	  	Logger log= Logger.getLogger("Search");
		PropertyConfigurator.configure("log4j.properties");
	  
	  driver.get("https://www.google.com");
	  log.info("Google Home Page");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
