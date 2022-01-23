package learnjavacore.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps" 
 */
public class ReverseWords {

	public static void main(String[] args) {
		
		String string = "The quick brown fox jumps over the lazy dog."; 
		System.out.println(reverseWordsTest(string));
		System.out.println(reverseWords3(string));
		
		if (reverseWordsTest(string).equals(reverseWords3(string))) {
			System.out.println(true);
		} else System.out.println(false);
//		System.out.println(reverseWords2(""));
//		System.out.println(reverseWords2(" The quick brown fox jumps over the lazy dog.    "));

	}  
	
	private static void stringAppend(StringBuilder sbWorld, StringBuilder sbOut) {
		 if (sbWorld.length() != 0) {
			 sbOut.append(sbWorld.reverse());
			 sbWorld.delete(0, sbWorld.length());
		 }
	}
	
	public static String reverseWords(final String original)	
	{	 
		 var sbOut = new StringBuilder();
		 var sbWorld = new StringBuilder();
		 for (Character ch : original.toCharArray()) {
			 if (!Character.isWhitespace(ch)) {
				 sbWorld.append(ch);
			 }
			 else {
				 stringAppend(sbWorld, sbOut);
				 sbOut.append(ch); 
			 }
		 }		 
		 stringAppend(sbWorld, sbOut);
		 return sbOut.toString();  
	 }
	
	  public static String reverseWords3(final String original)
	  {
	    return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
	                .map(str -> new StringBuilder(str).reverse().toString())
	                .collect(Collectors.joining());
	  }
	  
		
	  public static String reverseWordsTest(final String original)
	  {
	      return Arrays.stream(original.split("(?=\\s+)"))
	                .map(str -> new StringBuilder(str).reverse().toString())
	                .collect(Collectors.joining());
	      
	      //String[] strsString = {"1","3","4","5","6","7","8"};
	     // Arrays.stream(strsString).max(null);
//	                .map(str -> new StringBuilder(str).reverse().toString())
//	                .collect(Collectors.joining());
	  }

	
	  public static String reverseWords2(final String original)
	  { 
	    String[] array = original.split(" ");
	    
	    if(array.length == 0) 
	        return original;
	    
	    
	    int i = 0;
	    for(String string : array){
	        array[i] = new StringBuilder(string).reverse().toString();
	        i++;
	    }
	    
	    return String.join(" ",array);
	  }
	  
	
}
