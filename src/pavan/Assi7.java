package pavan;

//assi 7
class Assi7{

	void maxNum(int num1 , int num2){
		if(num2>num1){
			System.out.println(num1+" is smaller than" + " and " +num2);
		}
	}
	
	void minNum(int num1, int num2){
		if(num1<num2){
		System.out.println(num2+ " is bigger than " +num1+ "and" +num2);
		}
	}
	
	public static void main (String[] args){
		Assi7 assi = new Assi7();
		assi.maxNum(11,20);
		assi.minNum(11,20);
		}
}