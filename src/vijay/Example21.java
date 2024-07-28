package vijay;

class Example21{

	int processData(int startRange, int endRange){
		int count=0;
		int sum=0;
		for (int num=endRange; num>=startRange; num--){
			if(num%5==0 && num<3){
				sum=sum+num;
				count++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		Example21 example21 = new Example21();
		int ans = example21.processData(1,100);
	}
}

// You can try to fix above code in your free time because its not showing anything in result.

// method has return type. like here : int processData(int startRange, int endRange){
//if method has return type, then we must have to call that return type. like here : return sum;
// value get written only where we call the method. like here : int ans = example21.processData(1,100);