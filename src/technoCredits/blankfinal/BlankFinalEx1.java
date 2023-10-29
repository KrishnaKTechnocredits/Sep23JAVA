package technoCredits.blankfinal;

public class BlankFinalEx1 {
	
	final String gstNumber;
	final static int num;
	
	static{
		num = 10;
	}

	public BlankFinalEx1(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	
	public BlankFinalEx1() {
		this("12ADBC34");
	}
	
	public static void main(String[] args) {
		BlankFinalEx1 ex1 = new BlankFinalEx1("GF4543ER");
		BlankFinalEx1 ex2 = new BlankFinalEx1();
	}
	
}
