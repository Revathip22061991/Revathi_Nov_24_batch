package week2.homeassignments_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingSelect {

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
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Revz Testing2");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		//Select "ComputerSoftware" as the industry
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select ind = new Select(industry);
		ind.selectByIndex(3);
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own = new Select(ownership);
		own.selectByVisibleText("S-Corporation");
        //Select "Employee" as the source using SelectByValue
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sou = new Select(source);
		sou.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement market = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select mar=new Select(market);
		mar.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select st=new Select(state);
		st.selectByValue("TX");
		//Click the "Create Account" button
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				//Verify that the account name is displayed correctly
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Account Details")) {
					System.out.println("Account Details is displayed correctly");
				}
				else
				{
					System.out.println("Account Details is not displayed correctly");
				}
				
				//Close the browser window
				//driver.close();
			}
}