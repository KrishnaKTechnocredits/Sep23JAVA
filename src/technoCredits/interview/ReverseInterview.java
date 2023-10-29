package technoCredits.interview;

public class ReverseInterview {
	
	String reverseWord(String input){
		String output = "";
		for(int index=input.length()-1;index>=0;index--){
			output = output + input.charAt(index);
		}
		return output;
	}
	
	
	void reserveWordString(String str){
		String[] arr = str.split(" ");
		for(int index=arr.length-1;index>=0;index--){
			System.out.print(reverseWord(arr[index]) + " ");
		}
	}
	
	public static void main(String[] args) {
		String str = "India is my country";
		System.out.println(str);
		ReverseInterview reverseInterview = new ReverseInterview();
		reverseInterview.reserveWordString(str);
	}
}
