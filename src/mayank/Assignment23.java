package mayank;
/*Assignment23 14/09/2023
Write a pragram tofind count of uppercase,lowercase,digits and special characters. String str="TecHNo_cR6ediTs"
output=uppercase->5  lowercase->8 digits specialchar count->1*/

public class Assignment23 {
		void characters(String input){
			int ucount=0;
			int lcount=0;
			int dcount=0;
			int scount=0;
			for(int index=0;index<input.length();index++){
				if(Character.isUpperCase(input.charAt(index))){
					ucount++;
				}
					else if (Character.isLowerCase(input.charAt(index))){
						lcount++;
					}else if (Character.isDigit(input.charAt(index))){
						dcount++;
					}else
						scount++;
					}
						System.out.println("UpperCase -> " +ucount);
						System.out.println("lowercase -> " +lcount);
						System.out.println("Digit -> " +dcount);
						System.out.println("Specialchar -> " +scount);
		}
		public static void main(String [] args){
			Assignment23 assignment23 = new Assignment23();
			assignment23.characters("TecHNo_cR6ediTs");
		}	
	}

