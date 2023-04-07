package TestPackage1;

public class StarPrint15 {

	public static void main(String[] args) {
		
		
		int star=9;
		int space=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
				if(space==star/2)
				{
					System.out.print(" ");
					space++;
				}
				else
				{
					System.out.print("*");
				}
			}
			
			star--;
			System.out.println();
		}
		

	}

}