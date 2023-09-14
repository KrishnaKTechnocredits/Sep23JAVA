/*Assignment-22 : 13th Sep'2023
Write a program to print non repeatative character from given String.
input : technocredits
output : hnordis*/

package jyoti;

class NonRepeatativeChar{

	void printNonReptChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(" "+ch);
			}
		}
	}

	public static void main(String[] args) {
		NonRepeatativeChar nonreptch = new NonRepeatativeChar();
		nonreptch.printNonReptChar("technocredits");
	}
}


/*
total length=13
//The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
//The lastIndexOf() method returns the index (position) of the last occurrence of a specified value in a string.
//The lastIndexOf() method returns -1 if the value is not found.
//The lastIndexOf() method searches the string from the end to the beginning.
//The lastIndexOf() method is case sensitive.
//unique letter-which has indexOf and lastIndexOf are same
//instead on prinln use print to display in charachters in same line not in new line.
t	e	c	h	n	o	c	r	e	d	i	t	s
0	1	2	3	4	5	6	7	8	9	10	11	12
t--2
e--2
c--1
h--1
n--1
o--1
c--2
r--1
e--2
d--1
i--1
t--2
s--1

*/