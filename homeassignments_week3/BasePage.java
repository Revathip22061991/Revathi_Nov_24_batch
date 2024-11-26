package week3.homeassignments_week3;

public class BasePage {
	
	public void findElement() {
		System.out.println("findElement is printed");
	}
	public void clickElement() {
		System.out.println("clickElement is printed");
	}
	public void enterText() {
		System.out.println("enterText is printed");
	}
	public void performCommonTasks(){
		System.out.println("performCommonTasks is printed in BasePage");
	}
	public static void main(String[] args) {
	BasePage bp=new BasePage();
	bp.findElement();
	bp.clickElement();
	bp.enterText();
	bp.performCommonTasks();
	}
}
