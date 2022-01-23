package learnjavacore.codewars;

import java.util.Arrays;

/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3} 
*/

public class ArrayDiff {

	public static void main(String[] args) {
	 System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2})));
	}
	
	public static int[] arrayDiff(int[] a, int[] b) {
		  int n = 0;
		      Integer[] c = new Integer[a.length];
		      for (int i = 0; i < a.length ; i++){
		        for (int j = 0; j < b.length; j++){
		            if (a[i] == b[j]){
		                c[i] = a[i];
		                n++;
		                break;
		            }
		        }
		      }
		    
		      int[] d = new int[a.length-n];
		      int j = 0;
		      for (int i = 0; i < a.length; i++){
		        if (c[i] != null) continue;
		            d[j] = a[i];
		            j++;
		          
		      }
		      return d;  
		  }

}
