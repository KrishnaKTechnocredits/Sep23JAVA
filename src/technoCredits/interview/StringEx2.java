package technoCredits.interview;

//== [reference]
// equals() [compare content]
public class StringEx2 {

	public static void main(String[] args) {
		String str1 = new String("Techno");
		String str2 = "Techno";
		String str3 = "Techno";
		String str4 = new String("Techno");
		
		if(str1 == str2) {
			System.out.println(1);
		}
		
		if(str1 == str3) {
			System.out.println(2);
		}
		
		if(str1 == str4) {
			System.out.println(3);
		}
		
		if(str2 == str3) {
			System.out.println(4);
		}
		
		if(str1.equals(str4)) {
			System.out.println(11);
		}
		
		if(str1.equals(str4)) {
			System.out.println(22);
		}
		
		if(str1.equals(str4)) {
			System.out.println(33);
		}
		
		if(str2.equals(str4)) {
			System.out.println(44);
		}
		
		System.out.println("end");
	}
}
