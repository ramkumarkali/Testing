package week4.day1.homeassignment;

public class ApiClient {
	
	public static void sendRequest(String endpoint) {
		System.out.println("The endpoint is :"+endpoint);
	}
	
	public static void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("The endpoint :"+endpoint+" ----- The request body :"+requestBody+" ----- The status :"+requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApiClient client = new ApiClient();
		client.sendRequest("www.google.com");
		client.sendRequest("www.jio.com", "hi hello", true);
	}

}
