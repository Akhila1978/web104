import java.util.*; 
 public class Swap {
 public static void main(String[] args)
 {
    int[] array_nums = {12, 23, 12, 23, 12, 23};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int num1 = 12;
        int num2 = 23;
	
	System.out.println("Result: "+result(array_nums, num1, num2));
    }	
  
  public static boolean result(int[] array_nums, int num1, int num2) {
    for (int number : array_nums) {
      boolean r = number != num1 && number != num2;
      if (r) {
        return false;
        }
     }
        return true;
   }
}
