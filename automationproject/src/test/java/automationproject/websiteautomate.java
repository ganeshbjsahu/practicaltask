package automationproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;

public class websiteautomate {
	
	
	  //Creating a driver object referencing WebDriver interface
	
		
		@BeforeSuite
		public void startReport()
		{
			 //ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"/Reports/CRM "+ CustomDateFormat.getCurrentTime()+".html");
			 
		}
	@Test
	public void login()
	{
    WebDriver driver;
    
    //Setting the webdriver.chrome.driver property to its executable's location
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");

    //Instantiating driver object
    driver = new ChromeDriver();
    
    //Using get() method to open a webpage
    driver.get("https://magento.fmv.cc/goldenaromatherapy/");
    
    //maximize the browser
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//span[contains(text(),'SIGN IN/ACCOUNT')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praveensahu167@gmail.com");
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("QWqw1234");
    driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
  

}

	
}