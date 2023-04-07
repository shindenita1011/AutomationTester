package TestPackage1;

public class statismethod {

 static int Demo()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo();
		int c=Demo();
		System.out.println("print addition of two no="+c);

	}

}
