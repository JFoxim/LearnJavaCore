package learnjavacore.codewars;

public class Vowels {

/*
Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.	
*/
	public static void main(String[] args) {
		System.out.println(getCount("abracadabra"));
	}
	
	 public static int getCount(String str) {
		    int vowelsCount = 0;
		    char[] dict = {'a', 'e', 'i', 'o', 'u'};
		    char[] arrayCharacters = str.toCharArray();
		    for(char c : arrayCharacters) {
		      for (char f : dict) {       
		        if (f == c) {
		          vowelsCount++;
		          }
		      }
		    }    
		    return vowelsCount;
	  }

}
