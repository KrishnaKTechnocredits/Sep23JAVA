package pavan;

public class Assi20 {
	
	void charFrequency(String input) {
		
		for(int index=0; index<input.length();index++) {
			int count=0;
			char ch = input.charAt(index);
			for(int innerindex=0;innerindex<input.length();innerindex++) {
				if(input.charAt(innerindex)==ch) {
					count++;
					}
			}
			System.out.println(input + " -> "+ ch + "-> " +count);
		}
	}
	
	public static void main(String[] args) {
		Assi20 assi20 = new Assi20();
		assi20.charFrequency("aakanksha");
		
	}
}
