package TestPackage1;

import java.util.Scanner;

public class EvenOddByScanner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner (System.in);
		System.out.println("Enter int value");
		int No;
		No= x.nextInt();
	//	int Num;
		{
		
	//	if(No%2 ==1)//for odd no
			if(No%2 ==0)//for even no	
		{
			System.out.println("above no is even");
		}
		else
		{
			System.out.println("Above no is not even");
		}
		}
	}

}

