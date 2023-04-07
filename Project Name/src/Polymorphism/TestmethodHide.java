package Polymorphism;

public class TestmethodHide extends MethodHiding{
	public static void Demo()
	{
		System.out.println("Sub class demo method is running");
		
	}

	public static void main(String[] args) {
		TestmethodHide x=new TestmethodHide();
		x.Demo();
	}
}
