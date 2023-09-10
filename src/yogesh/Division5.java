//Assignment17
package yogesh;
class Division5{
	
	void div(int start,int end){
		int count=1;
		int temp=1;
			for(int index=end;index>=start;index--){
				if(index%2==0 && index%3==0){
					if(count>=2){
					System.out.println(index);
					if(temp==3)
					break;
					temp++;
				}
				count++;
			}
	}
	}
	public static void main(String[] args)
	{
		Division5 division=new Division5();
		division.div(10,100);
	}
}
