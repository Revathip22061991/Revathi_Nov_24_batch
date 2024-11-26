package week1.homeassignments_week1;

public class IsPrimeNumber {

		public static void main(String[] args) {
			
			int primeNumber =13;
			//Prime number is the number which is divisible by itself and 0
			
			boolean flag = true;
			
			for (int i = 2; i < primeNumber; i++) {
				
				if(primeNumber%i==0)
					
				{
				
				flag = false;
				}
			}
				if (flag)
				{
				
					System.out.println("The given number-"+ primeNumber +" is a Prime Number");
				}
				
				else
				{
					System.out.println("The given number-"+ primeNumber +" is not a Prime Number");
				}
			}
			
		}

