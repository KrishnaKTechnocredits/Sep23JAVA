/*Assingment - 27 : 18th Sep'2023
Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2
*/

package nivedita;
class A27RepFreq{
		void printFreq(String str){
			while(str.length()>0){
				int orgLen=str.length();
				char ch= str.charAt(0);
				str=str.replace(String.valueOf(ch),"");
				int newLen=str.length();
					if(orgLen-newLen>1){
						System.out.println(ch+"-->"+(orgLen-newLen));
						break;
					}
			}
		}
		public static void main(String[] args){
			A27RepFreq repFreq = new A27RepFreq();
			repFreq.printFreq("abcdcededffff");
		}
}
