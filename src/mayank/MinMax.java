//assignment 7
package mayank;


class MinMax{
	void min(int num1,int num2){
		if(num1<num2){
			System.out.println(num1+ " is smaller between " +num1+ "&" +num2);
		}else{
			System.out.println(num2+ " is smaller between " +num1+ "&" +num2);
		}
	}
	
	void max(int num1,int num2){
		if(num2>num1){
			System.out.println(num2+ " is bigger between "+ num1+ "&" +num2);
		}else{
			System.out.println(num1+ " is smaller between " +num1+ "&" +num2);
		}
	}
	
	public static void main(String[] args){
		MinMax minmax = new MinMax();
		minmax.min(10,17);
		minmax.max(10,17);
	}
}