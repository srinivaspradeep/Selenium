package withoutbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

public class headlessmode {
	WebDriver driver;
	
  @Test
  public void headlesmode() {
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("headless");
	  driver=new ChromeDriver(opt);
	  driver.get("https://www.flipkart.com/");
	  String title=driver.getTitle();
	  System.out.println("Title="+title);
	  
	  
  }
  
  

}
