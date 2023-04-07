package Polymorphism;

public class OverRiding2 extends OverRiding1 {
	
	public void Statement()
	{
		System.out.println("method from sub class is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OverRiding2 x=new OverRiding2();
      x.Statement();
      
      OverRiding1 y=new OverRiding2();//polymorphism happen bcz of this
      y.Statement();
      
      
	}

}
