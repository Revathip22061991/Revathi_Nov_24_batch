package week2.homeassignments_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiate the driver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/.");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click the "Login" button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the "Leads" tab
		driver.findElement(By.linkText("Leads")).click();
		//Click "Find leads" 
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on the "Phone" tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number 
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9843797299");
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the lead ID of the first resulting lead
		driver.findElement(By.xpath("//a[text()='17893']")).click();
		//Click the first resulting lead 
        //Click the "Delete" button 
		driver.findElement(By.linkText("Delete")).click();
		//Click "Find leads" again
		
		//Enter the captured lead ID
		
		//Click the "Find leads" button
		
		//Verify the presence of the message "No records to display" in the Lead List
		
		//This message confirms the successful deletion
		
		//Close the browser
		//driver.close();
	}

}
