package shrutika;
////Assignment -17
class DivisibleNumber3{

	void divisible(int startNum, int endNum){
		int count=1;
		int temp=1;
		for(int num=endNum; num>=startNum; num--){
			if(num%2==0 && num%3==0){
				if(count>=2){
					System.out.println(num);
					if(temp==3){
						break;
					}
					temp++;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleNumber3 divisibleNumber3 = new DivisibleNumber3();
		divisibleNumber3.divisible(10,100);
	}
}