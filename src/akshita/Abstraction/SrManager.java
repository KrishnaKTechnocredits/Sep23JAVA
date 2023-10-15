package akshita.Abstraction;

public abstract class SrManager implements Interface,Interface2{
	
	public void m1() {
		System.out.println(Interface.x);
		System.out.println(Interface2.x);
		//System.out.println(SrManager.x);   if both method has same variable then we cant called it
	}
	
	public void m2() {
		System.out.println(Interface.x);
	}

	public abstract void m3();                      //if u r not implementing all method instead then declared class as abstract
		
	@Override
	public void m4() {
		// TODO Auto-generated method stub	
	}
}
