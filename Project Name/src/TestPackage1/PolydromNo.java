package TestPackage1;

import java.util.Scanner;

public class PolydromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner x= new Scanner (System.in);
	//	System.out.println("Enter int value");
		int num=121;
		int rev = 0; 
	//for()
		if(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
	
		if(num==rev)
		{
			System.err.println("ploy no"+num);
		}

	}

}
