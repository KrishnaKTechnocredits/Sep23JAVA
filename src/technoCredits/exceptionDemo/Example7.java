package technoCredits.exceptionDemo;

// Child to parent catch up hierarchy should be followed otherwise its a compilation error.
public class Example7 {
	
	void m1() {
		try {
			
		}catch(IndexOutOfBoundsException e) {
			
		}
		/*catch(ArrayIndexOutOfBoundsException fe) { // CE
			
		}*/finally {
			System.out.println("Hi");
		}
		System.out.println("Hello");
	}
	
	int m2(){
		try{
			System.out.println("Hello");
			String str = "techno";
			return str.substring(3,9).length();
		}catch(NullPointerException e){
			System.out.println("Hi");
		}finally{
			return "technocredits".length();
		}
	}
	
	int m3(){
		try{
			System.out.println("Hello");
			String str = "techno";
			return str.substring(3,5).length();
		}catch(NullPointerException e){
			System.out.println("Hi");
		}finally{
			return "technocredits".substring(7,15).length();
		}
	}
	
	void m4(){
		try{
			System.out.println("Hello");
			String str = "techno";
			System.out.println(str.substring(3,5).length());
		}catch(NullPointerException e){
			System.out.println("Hi");
		}finally{
			 int len = "technocredits".substring(7,15).length();
			 System.out.println(len);
		}
	}
	
	public static void main(String[] args) {
		new Example7().m4();
		System.out.println("end");
	}

}
