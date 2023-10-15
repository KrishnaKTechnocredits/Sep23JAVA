package akshita.Abstraction;

public abstract class Emplyoee extends SrManager {

	@Override
	//abstract public void m3() {    cant declarer method as abstract having body
	
      //}
	
	public void m3() {
		System.out.println(x1);
	}

	@Override
	public void m5() {
	 System.out.println("test");	
	}
	
	//void m6();    if u write unimplemented abstract method directly then it ask for making abstract public method
	
	abstract public void m6();
}
