package jagrati;

public class ProgramTest1 {
	
	String getArrange(String input) {
		String Output = "";
		String Output1 = "";
		String Output2 = "";
		String Output3 = "";
		for (int index=0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
	           Output1 = Output1 +ch;
			}else if (Character.isUpperCase(ch)){
				Output2 = Output2 + ch;
			}else if (Character.isLowerCase(ch)) {
				Output3 = Output3 +ch;
			}else {
				System.out.println(ch);
			}
		}System.out.println(Output1+Output2+Output3);
		return Output;
	}
	
	String getSum(String input) {
		String OutputSum = "";
		int sum= 0;
		String Output2 = "";
		String Output3 = "";
		for (int index=0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
	           sum = sum + Character.getNumericValue(ch);
			}else if (Character.isUpperCase(ch)){
				Output2 = Output2 + ch;
			}else if (Character.isLowerCase(ch)) {
				Output3 = Output3 +ch;
			}else {
				System.out.println(ch);
			}
		}//System.out.println(sum);
		System.out.println(sum+Output2+Output3);
		return OutputSum;
		
	}
     public static void main(String[] args) {
    	 ProgramTest1 program= new ProgramTest1();
    	 program.getArrange("TeCHNoc33r44editS");
    	 program.getSum("TeCHNoc33r44editS");
     }
}
