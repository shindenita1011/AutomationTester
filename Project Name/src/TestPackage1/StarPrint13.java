package TestPackage1;

public class StarPrint13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int alphabet=65;
		int space=4;
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=alphabet;k++)
			{
				System.out.print((char)alphabet +" ");
			}
			alphabet++;
			space--;
			System.out.println();
		}

	}

}
