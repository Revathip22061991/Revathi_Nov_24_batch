package week2.homeassignments_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        //Instantiate the driver
				ChromeDriver driver=new ChromeDriver();
				//Load the URL
				driver.get("https://leafground.com/button.xhtml");
				//Maximize the browser window
				driver.manage().window().maximize();
		        //Click on the button with the text ‘Click and Confirm title’
				driver.findElement(By.xpath("//span[text()='Click']")).click();
		        //Verify that the title of the page is ‘dashboard’ 
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Dashboard")) {
					System.out.println("Title of the page is Dashboard");
				}
				else {
					System.out.println("Title of the page is not Dashboard");
				}
				driver.navigate().back();
		       //Check if the button with the text ‘Confirm if the button is disabled’ is disabled
			   WebElement disabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']"));
			   if(disabled.isEnabled())
			   {
			  System.out.println("Confirm if the button is disabled");
			   }
			   else 
			   {
			   System.out.println("‘Confirm if the button is disabled is not disabled");
			   }  
			  //Find and print the position of the button with the text ‘Submit.’ 
			   WebElement position = driver.findElement(By.xpath("//span[text()='Submit']"));
			   System.out.println(position.getLocation());
		      //Find and print the background color of the button with the text ‘Find the Save button color.’ 
		      //Find and print the height and width of the button with the text ‘Find the height and width of this button.’
			   WebElement button = driver.findElement(By.xpath("//span[text()='Submit']"));
			   System.out.println(button.getSize());
		      //Close the browser window
		      //driver.close();
	}

}
