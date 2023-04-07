package TestPackage1;

public class StarPrint14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
		for(int k=1;k<=4;k++)
		{
		for(int l=0;l<=star+1;l++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}

	}

}
