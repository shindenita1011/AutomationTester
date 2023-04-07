package TestPackage1;

public class StarPrint6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int star=0,space=5;
		
		for(int i=1; i<=5; i++)
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
		}

	}

}
