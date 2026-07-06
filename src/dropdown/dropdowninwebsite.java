package dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdowninwebsite {
	WebDriver driver;
	
	
  @Test
  public void dropdown() throws Exception{
	  driver.get("https://www.techlearn.in/code/registration/");
	  WebElement drp =driver.findElement(By.id("countries"));
	  Select sel= new Select(drp);
	  Thread.sleep(3000);
	  
	 // sel.selectByContainsVisibleText("Antig");
		//sel.selectByIndex(7);
		//sel.selectByValue("BD");
		sel.selectByVisibleText("Bolivia");
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new EdgeDriver();
	  driver.manage().window().maximize();
  }

}
