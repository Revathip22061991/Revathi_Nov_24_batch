package week2.homeassignments_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
				//Click on the "Accounts" tab
				driver.findElement(By.linkText("Accounts")).click();
		        //Click the the "Create Account" button
				driver.findElement(By.linkText("Create Account")).click();
				//Enter an account name
				driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Revz Testing1");
				//Enter a description as "Selenium Automation Tester."
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
				//Enter a Number Of Employees
				driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("20");
				//Enter a Site Name as “LeafTaps”
				driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
				//Click the "Create Account" button
				driver.findElement(By.xpath("//input[@value='Create Account']")).click();
				//Verify that the Title is displayed correctly
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Account Details")) {
					System.out.println("Title is displayed correctly");
				}
				else
				{
					System.out.println("Title is not displayed correctly");
				}
				//Close the browser window
				driver.close();
		

	}

}
;