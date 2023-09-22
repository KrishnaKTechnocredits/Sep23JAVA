package sakshi;

public class Assignment23 {

	void getCharCaseCount(String str){
		int uCount=0;
		int lCount=0;
		int dCount=0;
		int spCount=0;
		
		for(int index=0; index<str.length(); index++){
			if(Character.isUpperCase(str.charAt(index))){
				uCount++;	
			}else if(Character.isLowerCase(str.charAt(index))){
				lCount++;
			}else if(Character.isDigit(str.charAt(index))){
				dCount++;
			}else{
				spCount++;
			}	
		}
		System.out.println(str + " has uppercase " + uCount);
		System.out.println(str + " has lowercase " + lCount);
		System.out.println(str + " has digit " + dCount);
		System.out.println(str + " has special character  " + spCount);
	}

	public static void main(String[] args){
		Assignment23 assignment23 = new Assignment23();
		String str = "TecHNo_cR6ediTs";
		assignment23.getCharCaseCount(str);
	
	}
}
