package week5.homeassignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class ProjectSpecificMethod {
 
 public ChromeDriver driver;
 @Parameters({"url","uname","pword"})	
  @BeforeMethod
  public void preConditions(String url,String uname,String pword) {
	    
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);
	    //ChromeDriver driver= new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    //Login to https://login.salesforce.com
	    driver.get(url);
	    
	    //Username: dilip@testleaf.com
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
	    
	    //Password: leaf@2024
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pword);
  }

  @AfterMethod
  public void postConditions() {
	  driver.close();
  }

}
