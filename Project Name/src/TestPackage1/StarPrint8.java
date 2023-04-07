package TestPackage1;

public class StarPrint8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=3;
		int star=2;
		
		for(int i=1; i<=5; i++)
		
		{
	for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
	
		/*	for(int k=1;k<=star;k++)
			System.out.print("*");
				System.out.println();*/
			
			if(i<=2)
			{
			space--;
			star=star-1;
			System.out.println("");
			}
			else {
			
			space++;
		    star=star+2;
			}
		
	}

	}}
