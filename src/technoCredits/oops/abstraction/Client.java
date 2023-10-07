package technoCredits.oops.abstraction;

public class Client implements Interface1, Interface2{
	
	@Override
	public void display() {
		System.out.println(Interface1.x);
		System.out.println(Client.x);
	}
}
