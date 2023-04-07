package TestPackage1;

public class NonStaticmethod {
	
	public void Demo()
	{
		System.out.println("Non static method");
	}
	 public static void Test()
	 {
		 System.out.println("Print static method");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NonStaticmethod a=new NonStaticmethod();
     a.Demo();
     Test();
	}

}
