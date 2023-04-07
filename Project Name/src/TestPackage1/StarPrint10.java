package TestPackage1;

public class StarPrint10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int star=0,space=4;
		
		for(int i=1; i<=3; i++)
		{
			for (int j=1; j<=space; j++)
			{
				System.out.print("  ");
			}
		{
			for(int k=0 ;k<=star; k++ )
				System.out.print( " *");
		System.out.println();
		space--;
		star=star+2;
		}
		/*for(int l=1; l<=5; l++)
		{
		for (int m=1; m<=space; m++)
		{
			System.out.print("  ");
			
		}
		{
			for(int n=0 ;n<=star; n++ )
				System.out.print( " *");
		System.out.println();
		space++;
		star=star-2;
		}
		}*/
	}
	}}

