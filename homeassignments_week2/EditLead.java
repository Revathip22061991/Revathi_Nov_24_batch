package week2.homeassignments_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //Instantiate the driver
				ChromeDriver driver=new ChromeDriver();
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/");
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
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Revathi4");
				//Enter a LastName
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Poorna4");
				//Enter a CompanyName
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf4");
				//Enter a Title
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Testers4");
		        //Enter the FirstName (Local) Field Using Xpath. 
		        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Revz4");
		        //Enter the Department Field Using any Locator of Your Choice
		        driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Test12345");
		        //Enter the Description Field Using any Locator of your choice 
		        driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Test Description12345");
		        //Enter your email in the E-mail address Field using the locator of your choice
		        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("revz12345@gmail.com");
		        //Select State/Province as NewYork Using Visible Text 
		        WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		        Select st = new Select(state);
		        st.selectByVisibleText("New York");
		        //Click on the Create Button
		        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		        //Click on the edit button
		        driver.findElement(By.linkText("Edit")).click();
		        //Clear the Description Field
		        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
	            //Fill the Important Note Field with Any text
		        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Its for testing purpose");
		        //Click on the update button 
		        driver.findElement(By.xpath("//input[@value='Update']")).click();
		        //Get the Title of the Resulting Page
		        String title = driver.getTitle();
		        System.out.println(title);
		        //Get the Title of the Resulting Page
		        //driver.close();
		        //Close the browser window.

	}

}
