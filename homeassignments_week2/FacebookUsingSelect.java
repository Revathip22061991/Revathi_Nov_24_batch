package week2.homeassignments_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookUsingSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiate the driver
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Click on the Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aksharan");
		//Enter the Surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("PoornaKumar");
		//Enter the Mobile number or email address
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9834199132");
		//Enter the New password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Aksharan2024");
		//Handle all three dropdown in Date of birth
		//date
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d=new Select(date);
		d.selectByIndex(23);
		//month
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m=new Select(month);
		m.selectByIndex(11);
		//year
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select y=new Select(year);
		y.selectByIndex(1);
		//Select the radio button in Gender
		driver.findElement(By.linkText("Female")).click();
	}

}



