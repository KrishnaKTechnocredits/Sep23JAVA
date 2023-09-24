/*Program 1 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 3344eocreditTCHNS

String getOutput(String input){

}

Program 2 : Write a program to rearrange string as per below example.

String input = "TeCHNoc33r44editS";
output : 14eocreditTCHNS

String getOutput(String input){

}
*/


package jyoti;
public class Programming_Test1{
		
		String uOutput="";
		String lOutput="";
		String dOutput="";
		static String temp="";
		static String temp1="";
		int sum=0;
		String getOutput(String str){
			for(int index=0 ; index<str.length();index++){
				char ch=str.charAt(index);
				if(Character.isUpperCase(ch)){
					uOutput+=ch;
				}else if(Character.isLowerCase(ch)){
					lOutput+=ch;
				}else if(Character.isDigit(ch)){
					dOutput+=ch;
				}else{
					System.out.println("Out of Programme");
				}
			}
			temp=dOutput+lOutput+uOutput;
			return temp;
		}
		
		
		String getOutputSum(String str){
				Programming_Test1 p1 = new Programming_Test1();
				p1.getOutput(str);
				for(int index=0 ; index<str.length();index++){
					char ch=str.charAt(index);
					if(Character.isDigit(ch)){
						dOutput+=ch;
						sum=sum+(Character.getNumericValue(ch));
					}
				}
				temp1=sum+lOutput+uOutput;
				return temp1;
		}
		public static void main(String[] args){
		Programming_Test1 p = new Programming_Test1();
		p.getOutput("TeCHNoc33r44editS");
		System.out.println("Rearranged String---->"+temp);
		p.getOutputSum("TeCHNoc33r44editS");
		System.out.println("Sum of digits and rearranged string--->"+temp1);
		}

}
