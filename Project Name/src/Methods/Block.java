package Methods;

public class Block {
	
	static {
		System.out.println("static block is running");
	}
	{
		System.out.println("Non-static block is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Block x= new Block();
      
	}

}
