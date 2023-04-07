package Interface;

public class StaticInterface implements InterfaceTesting {
	public void Show()
	{
		System.out.println("Methos show is running");
	}

	public static void main(String[] args) {
		StaticInterface x= new StaticInterface();
		x.Show();
		InterfaceTesting.xyz();
	}
}
