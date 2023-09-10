package aditya;
class Assignment16{
		void DisplayNo(int StartRange, int EndRange){
			int count=0;
			System.out.println("Number is divsible by 3 and 4 :- ");
			for(int no=StartRange; no<=EndRange; no++){
				if(no%3==0 && no%4==0){
					System.out.println("Number is :- " +no);
					count++;
					if(count>=3){
						break;
					}
				}
			}
		}
		
		public static void main(String[] arge){
			Assignment16 as16= new Assignment16();
			as16.DisplayNo(10,500);
		}
}