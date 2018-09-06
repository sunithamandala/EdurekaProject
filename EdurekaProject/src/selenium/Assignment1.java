package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
      
	ChromeDriver driver;
	 
	void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		Dimension dim= new Dimension(600,600);
		driver.manage().window().setSize(dim);
		
	//	driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com");
		
	}
	
	String getPageTitle() {
		return driver.getTitle();
	}
	
	void navigateCommands() {
		driver.navigate().to("http://gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	
	
 void closeBrowser(){
	 
	// driver.close();
	 driver.quit();
	 
 }
}
