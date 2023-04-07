package Methods;

public class Contructor {
	
	int a;
	int b;
	int c;
	
	Contructor(){
		a=10;
		b=20;
		//int c=30;
	}
	
	Contructor(int d,int e)
	{
		a=d;
		b=e;
		
	}
Contructor(int f,int g,int h)
{
	a=f;
	b=g;
	c=h;
	
	}
public int Addition()
{
	//int c=30;
	return (a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contructor x= new Contructor();
		x.Addition();
		
		Contructor y= new Contructor(20,30);
		y.Addition();
		Contructor z= new Contructor(20,30,40);
		int c=z.Addition();
		System.out.println(c);
		

	}

}
