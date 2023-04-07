package TestPackage1;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String value="z";
		switch(value) {
		case "a":
			System.out.println("Today is Monday");
			break;
			
		case "b":
			System.out.println("Today is Tuesday");
			break;
			
		case "c":
			System.out.println("Today is Wednsaday");
			break;
			
		case "d":
			System.out.println("Today is Thursday");
			break;
			
		case "e":
			System.out.println("Today is Friday");
			break;
			
		case "f":
			System.out.println("Today is Saturday");
			break;
			
		case "g":
			System.out.println("Today is Sunday");
			break;
			
			default:
				System.out.println("Default case will execute");
		}
	}

}
