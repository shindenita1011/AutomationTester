package Abstract;

public class callingabstractclass extends abstractclass
{
	
	public void Rest()
	{
		System.out.println("Implemneted method");
	}
	
	public void Test()
	{
		System.out.println("Test method reimplement");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callingabstractclass x=new callingabstractclass();
         x.Rest();
         x.Test();
         
         abstractclass y= new callingabstractclass();
         y.Rest();
         y.Test();
         
	}

}
