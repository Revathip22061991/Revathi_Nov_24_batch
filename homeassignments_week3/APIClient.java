package week3.homeassignments_week3;

import static org.testng.Assert.expectThrows;

public class APIClient {
		
		public void sendRequest(String endpoint) {
			System.out.println("Endpoint1 is noted"+" "+endpoint);
		}
		public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
			System.out.println("Endpoint2 is noted"+" "+endpoint+" "+"Body Data is displayed"+" "+requestBody+" "+"Request Status"+" "+requestStatus);
		}

		public static void main(String[] args) {
			APIClient a = new APIClient();
			a.sendRequest("loading1");
			a.sendRequest("loading2","TextBody",true);
		}
	
}
