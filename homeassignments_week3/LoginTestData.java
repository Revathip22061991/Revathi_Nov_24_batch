package week3.homeassignments_week3;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
	
		System.out.println("Enter the Username");		
	}
	public void enterPassword() {
		System.out.println("Enter the Password");
	}
	
	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterCredentials();
		ltd.enterPassword();
		ltd.enterUsername();
		ltd.navigateToHomePage();
	}
}