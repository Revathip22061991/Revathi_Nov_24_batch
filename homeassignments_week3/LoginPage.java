package week3.homeassignments_week3;

public class LoginPage extends BasePage{
	
	public void performCommonTasks(){
		System.out.println("performCommonTasks is printed in LoginPage");
	}
	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.performCommonTasks();
		
	}

}
