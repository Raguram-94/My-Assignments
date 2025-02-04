package week3.day2PolymorbismHomeAssignment;

public class APIClient {
	
	// Method Overloading 

	public String sendRequest(String endpoint) {
		return endpoint;

	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        String enpt=endpoint;
        String regbdy=requestBody;
        boolean reqsts=requestStatus;
        System.out.println(enpt);
        System.out.println(regbdy);
        System.out.println(reqsts);
	}

	public static void main(String[] args) {
		APIClient apiClient=new APIClient();
		String sendRequest = apiClient.sendRequest("sendRequest method one argument String endpoint called");
		System.out.println(sendRequest);
		apiClient.sendRequest("sendRequest method three argument String endpoint called ", "sendRequest method one argument String requestBody called",true);
		
		

	}

}
