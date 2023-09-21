/*Assingment - 25 : 18th Sep'2023
Print the freq of all character using nested for loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1
*/
package nivedita;
class A25PrintFreq{
		void printDetails(String str){
				int l= str.length();
				for(int index=0; index<l; index++){
					int count=0;
					char ch= str.charAt(index);
					if (ch != '*'){
							for (int innerIndex=0; innerIndex < l; innerIndex++){
								char ch1= str.charAt(innerIndex);
								if (ch1==ch)
									count++;
							}
								str=str.replace(ch,'*');
								System.out.println(ch+" : ch-->" +count);
					}
				}
		}	
			
		public static void main(String[] args){
			A25PrintFreq printFreq = new A25PrintFreq();
			printFreq.printDetails("aakanksha");
		}

}
