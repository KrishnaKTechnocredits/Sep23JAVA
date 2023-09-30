package technoCredits.oops.inheritance;
class B extends A{
	int y = 30;
	int z = 40;
	
	void m2(){
		int t = 1000;
		System.out.println("Y :" + (y+z)); // 
		System.out.println("B m2 " + t);
	}
	
	void m3(){
		System.out.println("B m3");
	}
	
}