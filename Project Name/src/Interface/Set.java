package Interface;

public class Set implements Test {
	
	public void Define()
	{
		System.out.println("Method define is running");
	}
	
	public void Setup()
	{
		System.out.println("mthod setup is running");
		
	}
	
	public static void main(String[] args) {
		Set x= new Set();
		//x.Setup();
		x.Define();
		x.Setup();
		
	}

}
