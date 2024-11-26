package week1.homeassignments_week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range=8, num1=0, num2=1, num3=0;
		
		for (int i = 1; i <=8; i++) {
			
			num1=num2;
			num2=num3;
			num3=num1+num3;
			System.out.println("The fibonacci series are: " + num3);
			
		}
	}

}
