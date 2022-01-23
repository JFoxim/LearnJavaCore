package learnjavacore.codewars;

import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

//	Testing: [0, 0, 0, 1] ==> 1
//	Testing: [0, 0, 1, 0] ==> 2
//	Testing: [0, 1, 0, 1] ==> 5
//	Testing: [1, 0, 0, 1] ==> 9
//	Testing: [0, 0, 1, 0] ==> 2
//	Testing: [0, 1, 1, 0] ==> 6
//	Testing: [1, 1, 1, 1] ==> 15
//	Testing: [1, 0, 1, 1] ==> 11
	
	/* Convert from binary value to decimal
	 *  
	 */
	public static void main(String[] args) {
		System.out.println(ConvertBinaryArrayToInt(Arrays.asList(1,0,0,1))); 
	}
	
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		 int result = 0;
		 int n = 0;
		 for (int i = binary.size()-1; i >= 0; i--) {
			  n++;
			  System.out.println(n);
			  if (binary.get(i) == 1) {
				 result = result + n;
			  }
		}
		return result;		
    }

}
