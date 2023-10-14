package akshita.Abstraction;

public interface Interface2 extends Interface {
	int x=100;
	int x1 =50;
	void m4();
	//String m1();   cant use same method with different return type. Interface has void m1()
	
	void m1();    //we can declare same method with same parameter as extended interface
	
	//Interface2 in = new Interface2(); //Cant  instantiate interface
	
	void m5();
}
