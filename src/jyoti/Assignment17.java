package jyoti;


	class Assignment17 {
			void div2n3(int startRange, int endRange) {
			int count=1;
			int temp=1;
				System.out.println("Number divisible by 2 and 3 are listed below-");
				System.out.println("==============================================");
				for(int num=endRange; num>=startRange; num--) {
					if(num%2==0 && num%3==0) {
						if(count>=2) {
						System.out.println(num);
								if(temp==3) {
								break;
								}
								temp++;
								}
							count++;
						}
					}
				}
				
			
		public static void main(String[] args) {
			Assignment17 assgn= new Assignment17();
			assgn.div2n3(10,100);
		}
}