package Inheritance;

public class Child1 extends Child {
	
	public void cycle() {
		
		System.out.println("Cycle");
		// TODO Auto-generated method
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		 Child1 x= new Child1();
		    x.home();
		    x.car();
		    x.money();
		    x.bike();
		    x.cycle();
	}

}
