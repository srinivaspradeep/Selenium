package getmethods;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gettitleurltext {
	WebDriver driver;
	
  @Test
  public void gettitle() throws Exception {
	  
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(2000);
	  String str=driver.getTitle();
	  System.out.println("Title="+str);
	  String strexp ="YouTube";
	  Assert.assertEquals(str, strexp);
	  System.out.println("Actual="+str+"    "+"Expected="+strexp);	  
  }
  
  @Test
  public void gettext() throws Exception {
	  
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();
	  String str = "For You";		
	  String actalltext = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[1]/div/div/div/a/div/div/div[2]")).getText();
	  Assert.assertEquals(actalltext, str);
	  System.out.println("Actual="+actalltext+"    "+"Expected="+str);	  
	  
	  String str2 = "Fashion";		
	  String actalltext1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/a/div/div/div[2]")).getText();
	  System.out.println("val="+actalltext1);
	  Assert.assertEquals(actalltext1, str2);
	  System.out.println("Actual="+actalltext1+"    "+"Expected="+str2);
	  
	  String str3 = "Mobiles";		
	  String actalltext3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[3]/div/div/div/a/div/div/div[2]")).getText();
	  System.out.println("val="+actalltext3);
	  Assert.assertEquals(actalltext3, str3);
	  System.out.println("Actual="+actalltext3+"    "+"Expected="+str3);
	  
  }
  @Test
  public void gettextyt() throws Exception{
	  
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(5000);
	  String str1 = "Home";		
	  String actalltext1 = driver.findElement(By.xpath("//*[@id=\"endpoint\"]/span")).getText();
	  System.out.println("val="+actalltext1);
	  Assert.assertEquals(actalltext1, str1);
	  System.out.println("Actual="+actalltext1+"    "+"Expected="+str1);
	  
	  String str2 = "Shorts";		
	  String actalltext2 = driver.findElement(By.xpath("(//*[@id=\"endpoint\"]/span)[2]")).getText();
	  System.out.println("val="+actalltext2);
	  Assert.assertEquals(actalltext2, str2);
	  System.out.println("Actual="+actalltext2+"    "+"Expected="+str2);
	  
	  String str3="Subscriptions";
	  String acttext3=driver.findElement(By.xpath("(//*[@id=\"endpoint\"])[3]")).getText();
	  System.out.println("Val="+acttext3);
	  Assert.assertEquals(acttext3, str3);
	  System.out.println("Actual="+acttext3+"    "+"Expected="+str3);
  
	  String str4="You";
	  String acttext4=driver.findElement(By.xpath("(//*[@id=\"endpoint\"])[4]")).getText();
	  System.out.println("Val="+acttext4);
	  Assert.assertEquals(acttext4, str4);
	  System.out.println("Actual="+acttext4+"    "+"Expected="+str4);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new EdgeDriver();
	  driver.manage().window().maximize();
  }

}
