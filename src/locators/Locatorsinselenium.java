package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class Locatorsinselenium {

	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();		
	}		

	@Test
	void idnameclassname() throws Exception {
		driver.get("https://www.gktbooks.com/");	
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("username")).sendKeys("e.srinivaspradeep@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Zxcv1234!");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/a")).click();	
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("e.srinivaspradeep@gmail.com");		
	}
}
