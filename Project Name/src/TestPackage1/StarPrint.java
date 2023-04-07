package TestPackage1;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=0;
		int star=5;
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star=star-2;
			space++;
			System.out.println();
		}

	}

}
