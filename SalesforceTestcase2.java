package week5.homeassignments;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SalesforceTestcase2 extends ProjectSpecificMethod{
@Test
	public  void testcase2() throws InterruptedException {
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
   
   //Enter the Company name as 'TestLeaf'
   WebElement compName = driver.findElement(By.xpath("//input[@name='CompanyName']"));
   compName.sendKeys("TestLeaf");
   
   //Enter Description as 'Salesforces'
   WebElement desc = driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container']/textarea[@class='slds-textarea'])[2]"));
   desc.sendKeys("Salesforces");
   
   //Select Status as 'Active'
   WebElement active = driver.findElement(By.xpath("//label[text()='Status']"));
   js.executeScript("arguments[0].scrollIntoView();", active);
   active.click();
   driver.findElement(By.xpath("//span[text()='Active']")).click();
   
   //Verify the Alert message (Complete this field) displayed for Name
   String alert = driver.findElement(By.xpath("//div[contains(text(),'Complete this field')]")).getText();
   System.out.println("Alert message displayed is:"+alert);
   
   //Click save and verify Legal Entity Name
   driver.findElement(By.xpath("//li[@class='slds-button-group-item visible']//button[text()='Save']")).click();
 
   WebElement pop = driver.findElement(By.xpath("//lightning-button-icon[@class='slds-float_right slds-popover__close']/button[@class='slds-button slds-button_icon slds-button_icon-bare slds-button_icon-inverse']"));
   act.moveToElement(pop).perform();
   pop.click();
   
   
   
	} 

}
