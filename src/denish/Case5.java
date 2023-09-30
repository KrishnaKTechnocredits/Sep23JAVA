package denish;

public class Case5 {
	
	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		a = b;
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z); (same as case 3: properties cant access) 
		a.m1();
		a.m2(); //(here value of y will take from parent class only)
		//a.m3();  (same as case 3: beahiour can only acces if it changes)
	}
}
