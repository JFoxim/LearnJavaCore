package learnjavacore.codewars;

import java.util.Arrays;

/*
A perfect power is a classification of positive integers:

In mathematics, a perfect power is a positive integer that can be expressed as an integer power of another positive integer. More formally, n is a perfect power if there exist natural numbers m > 1, and k > 1 such that mk = n.

Your task is to check wheter a given integer is a perfect power. If it is a perfect power, return a pair m and k with mk = n as a proof. Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.

Note: For a perfect power, there might be several pairs. For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid solutions. However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.

Examples
isPerfectPower(4) => new int[]{2,2}
isPerfectPower(5) => null
isPerfectPower(8) => new int[]{2,3}
isPerfectPower(9) => new int[]{3,2}
 */
public class PerfectPower {

	public static void main(String[] args) {
		//System.out.println(Math.pow(9, 2));
		//System.out.println(Arrays.toString(isPerfectPower(140608)));
		System.out.println(Arrays.toString(isPerfectPower2(9)));
		System.out.println(log2(25));
	}
	
	  public static int[] isPerfectPower2(int n) {
		    if (n < 4)
		        return null; 
			if (n == 5)
		        return null;
			double res;		
			int m = 2;
			
			for (int i = 2; i < Integer.MAX_VALUE; i++) {	
				res = Math.pow(i,m);
				System.out.println(i +", "+ res);
				if (n == res) return new int[] {i, m};
				else if (n > res) {
					m = m + 1;
					res = Math.pow(i,m);
				if (n == (int)res) return new int[] {i, m};
				else { m = m-1;}
				}
			}  
		    return null;
	  }
	
	  public static int[] isPerfectPower(int n) {
		    if (n < 4)
		        return null; 
			if (n == 5)
		        return null;
			double res;
			
			
			int[] basisArray = {2,3,5,6,7,10};
			
			
			for (int i = 0; i < basisArray.length; i++) {	
				res = Math.log(n & 0xffffffffL) * 1.000000000001 / Math.log(i);
				int resInt = (int)res;
				if (res - resInt < 0.000001) return new int[] {i, (int)res};				
			}  
		    return null;
	  }
	  
	  public static int log2(int n){
		    if(n <= 0) throw new IllegalArgumentException();
		    return 32-Integer.numberOfLeadingZeros(n);
		    //return 31 - Integer.numberOfLeadingZeros(n); // основание 2
		}

}
