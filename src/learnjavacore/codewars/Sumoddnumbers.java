package learnjavacore.codewars;

/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8
 */
public class Sumoddnumbers {

    public static void main(String[] args) {
       System.out.println(rowSumOddNumbers(1));
       System.out.println(rowSumOddNumbers(2));
       System.out.println(rowSumOddNumbers(3));
       System.out.println(rowSumOddNumbers(4));
       System.out.println(rowSumOddNumbers(42));  //74088
    }

    //число степени 3
    public static int rowSumOddNumbers(int n) {
        int result = 1;
        for (int i = 0; i < 3; i++){
             result = result * n;
        }
        return result;
    }

    public static int rowSumOddNumbers2(int n) {
        return n * n * n;
    }
}
