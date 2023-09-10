package aditya;
class Assignment14{
		void DisplayNo(int StartNo, int EndNo){
			for(int No=EndNo; No>=StartNo; No--){
				if(No%5==0 && No%9==0){
					System.out.println("Number divsisble by 5 and 9 " +No);
					break;
				}
			}
		}
		
		public static void main(String[] args){
			Assignment14 as14 = new Assignment14();
			as14.DisplayNo(5,100);
		}
}
