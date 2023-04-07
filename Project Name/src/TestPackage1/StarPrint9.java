package TestPackage1;

public class StarPrint9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		//int star=5;
		int space=0;

		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=5;j++)
			{			
				if (j<= space)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println(" ");
			space++;
		}
	/*	for(int k =1;k<=star;k++)
		{
			
		}
		star--;*/
		
		
		
		
		}
}



				

	


