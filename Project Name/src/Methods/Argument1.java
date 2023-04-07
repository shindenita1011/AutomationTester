package Methods;

public class Argument1 {
	
	public static void Addition(int a, int b)//static
	{
		int c=a+b;
		System.out.println("Addition of no==" +c);
	}
public void Addition1(int a, int b)//non static
{
	int c=a+b;
	System.out.println("Addition of no=="+c);
	}
public static void Addition2()//static without arg
{  int a=10;
    int b=20;
	int c=a+b;
	System.out.println("Addition of no==" +c);
}
public void Addition3()//non static without agru
{
	int a=30;
	int b=40;
    int c=a+b;
     System.out.println("Addition of no=="+c);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition(1,5);
		Addition(2,5);
		Argument1 z= new Argument1();
		z.Addition1(7, 8);
		Addition2();
		Argument1 x= new Argument1();
		x.Addition3();


	}

}
