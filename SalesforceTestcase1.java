package week5.homeassignments;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class SalesforceTestcase1 extends ProjectSpecificMethod{
@DataProvider(name="getData")

	public String[][] fetchData() throws IOException {
		return ReadLib.readValue();
		
	}
			public  void testcase1() {
		// TODO Auto-generated method stub
    
   //Login button
   driver.findElement(By.xpath("//input[@id='Login']")).click();
   
   //Click on the toggle menu button from the left corner
   driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
   
   //Actions
   Actions act = new Actions(driver);
   
   //javascriptExecuter
   JavascriptExecutor js = (JavascriptExecutor) driver; 
   
   //Click View All and click Legal Entities from App Launcher
   driver.findElement(By.xpath("//button[text()='View All']")).click();
   
   WebElement element = driver.findElement(By.xpath("//li[@class='slds-size_1-of-5 slds-col--padded slds-p-vertical_small']//p[text()='Legal Entities']"));
   js.executeScript("arguments[0].scrollIntoView();", element);
   element.click();
  
   //Click on the Dropdown icon in the legal Entities tab
   WebElement Obj = driver.findElement(By.xpath("//one-app-nav-bar-item-root[@class='navItem slds-is-unsaved slds-context-bar__item slds-shrink-none slds-is-active']//lightning-icon[@class='slds-icon-utility-chevrondown slds-icon_container']"));
   act.moveToElement(Obj).perform();
   Obj.click();
     
   //Click on New Legal Entity
   WebElement entity = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
   act.moveToElement(entity).perform();
   act.doubleClick(entity).perform();
   
   //Enter Name as 'Salesforce Automation by *Your Name*'
   WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
   name.sendKeys("Salesforce Automation by Revathi");
   
   //Click save and verify Legal Entity Name
   driver.findElement(By.xpath("//li[@class='slds-button-group-item visible']//button[text()='Save']")).click();
 
   String output="Salesforce Automation by Revathi";
   
   String input = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Revathi']")).getText();
   System.out.println(input);
   
   if(input.equals(output)){
	 System.out.println("Legal Enity name verification is Success");
   }
   else {
	  System.out.println("Legal Enity name verification is Failed");
   }
   
   
	} 

}
