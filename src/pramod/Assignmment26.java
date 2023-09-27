package pramod;



public class Assignmment26 {
	void printFreq(String str){
		while(str.length()!=0){
			int orgLen=str.length();
			char ch= str.charAt(0);
			str=str.replace(String.valueOf(ch),"");
			int newLen=str.length();
			System.out.println(ch+"-->"+(orgLen-newLen));
		}
	}
	
public static void main(String[] args){
	Assignmment26 wl= new Assignmment26();
wl.printFreq("aakanksha");

}
}
