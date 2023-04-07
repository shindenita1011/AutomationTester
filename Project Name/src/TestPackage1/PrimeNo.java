package TestPackage1;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=1 ; i<=100 ; (i=i/1 && i=i%1)  //odd no from 100 to 1
		/*int num=11;
		int i=2;
		while(i<num)
		{
			if(num%i==0)
			{
	  System.out.println("This is not prime no="+num);
	  break;
	       }
			i++;
			if(i==num)
			{
				System.out.println("This is prime no="+num);
			}
			
			}*/
		
		int num=100;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			System.out.println(num+"-->this is not prime no");
			break;
			}
			
			else
			{
				System.out.println(num+"-->this is prime no");
			break;
			}
		}
		}
	

}
