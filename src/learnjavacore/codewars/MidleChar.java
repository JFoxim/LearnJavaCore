package learnjavacore.codewars;

import java.util.Stack;

/*
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
#Examples:
 Kata.getMiddle("test") should return "es"
 Kata.getMiddle("testing") should return "t"
 Kata.getMiddle("middle") should return "dd"
 Kata.getMiddle("A") should return "A"
#Input
 A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
#Output
 The middle character(s) of the word represented as a string.
*/
public class MidleChar {

	public static void main(String[] args) {
		System.out.println(getMiddle3("testkl"));
		System.out.println(getMiddle3("middle"));
		System.out.println(getMiddle3("testing"));
		System.out.println(getMiddle3("A"));
	} 
	
	public static String getMiddle(String word) {
		int len = word.length();
		int mi = len/2;
		return (len%2 == 0) ? word.substring(mi-1, mi+1) : word.substring(mi, mi+1);  
	}
	
	public static String getMiddle2(String word) {
		    int mi = word.length() / 2;
		    return word.substring(mi - (word.length() % 2 == 0 ? 1 : 0), mi + 1);
	 }
	 
	public static String getMiddle3(String word) {
	        int length = word.length();
	        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
	 }

}
