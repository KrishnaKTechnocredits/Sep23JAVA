package mayank;


public class Assignment35 {
		void NameAndFirstLetter(String[] arr) {
			for(int index=0; index<arr.length;index++) {
				char first =arr[index].charAt(0);
				System.out.println(arr[index]+"->" +first);	
			}	
		}
		public static void main(String[] args) {
		String[] arr= {"Sayali","deepak","Nivedita","Yogesh"};	
		Assignment35 assignment35= new  Assignment35();
		assignment35.NameAndFirstLetter(arr);
		}
}
