package week2.homeassignments_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		//Click on the "Create Lead" button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Revathi1");
		//Enter a LastName
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Poorna1");
		//Enter a CompanyName
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf1");
		//Enter a Title
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Testers1");
		//Enter the phone number
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9843797299");
		//Click the "Create Lead" button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Verify if the title is displayed correctly
		 String title = driver.getTitle();
		 System.out.println(title);
		if(title.contains("View Lead")) {
			System.out.println("Title is displayed correctly");
		}
		else
		{
			System.out.println("Title is not displayed correctly");
		}
		//Close the browser window
		//driver.close();
	}

}
