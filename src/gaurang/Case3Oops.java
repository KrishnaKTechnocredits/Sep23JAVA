package gaurang;

public class Case3Oops {

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z);  (properties cant access)
		a.m1();
		a.m2();
		//a.m3(); (beahiour can only acces if it changes)
	}
}
