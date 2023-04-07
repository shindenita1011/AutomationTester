package TestPackage1;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String UN="NTP" , PWD="abc@123";
		
		if(UN=="NTP")
		{
		
		System.out.println("UN is correct");
		
		
		if(PWD=="abc@123")
		{
			System.out.println("PWD is correct");
			System.out.println("Login successfully");
		}
		else
		{
			System.out.println("pwd is incorrect");
			System.out.println("login failed");
		}
		}
			
		else
			
		{
			System.out.println("login failed");
		}
	}

}
