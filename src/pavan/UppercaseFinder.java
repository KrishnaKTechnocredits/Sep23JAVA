package pavan;

public class UppercaseFinder { 
	
	public static String findUppercase(String input) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);

        
        if (c >= 'A' && c <= 'Z') {
            result.append(c);
        }
    }

    return result.toString();
}

public static void main(String[] args) {
    String input = "TeCHNocreditS";
    String uppercaseLetters = findUppercase(input);
    System.out.println( uppercaseLetters);
}
}


