package launchingbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.facebook.com/");
		System.out.println("Title: " + chromedriver.getTitle());
		//chromedriver.wait();
		chromedriver.close();
		
	/*	WebDriver firefoxdriver=new FirefoxDriver();
		firefoxdriver.get("https://www.facebook.com/");
		firefoxdriver.close();
		
		WebDriver edgedriver=new  EdgeDriver();
		edgedriver.get("https://www.facebook.com/");
		edgedriver.close();
		*/
	}
}