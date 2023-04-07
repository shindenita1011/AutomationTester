package inheritance1;

public class Parent {

	
	static int a;
	static int b;
	static int c;
	


Parent()
{
	a=20;
	b=30;
	}
Parent(int d, int e)
{
	a=d;
	b=e;
	}
void add()
{
	System.out.println(a+b);
	}



static void main()
{
	System.out.println("static method");
	}
}