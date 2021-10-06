/*Problem: Check if array is sorted in accending order
  time complexity: O(n)
  space complexity:O(1)
  
  Example:8 12 15 //true
          8 10 10 12 //true
          100 //true
          100 20 200 //false
          
  Approach: transverse through array and check if next element is greter than previous if yes then array is sorted otherwise not
  
*/

package array;

import java.util.Scanner;

public class CheckIfArrayIsSorted {

	public static boolean IsSortedArray(int[] array, int length) {
		for (int itr = 0; itr < length - 1; itr++) {
			if (array[itr] > array[itr + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter length of array");

		int length = sc.nextInt();
		int[] Array = new int[length];

		System.out.println("insert an array");

		for (int itr = 0; itr < length; itr++) {
			Array[itr] = sc.nextInt();
		}

		System.out.println("elemets in array are");
		for (int itr = 0; itr < length; itr++) {
			System.out.print(Array[itr] + " ");
		}

		System.out.println();

		if (IsSortedArray(Array, length)) {
			System.out.println("array is sorted in increasing order");
		} else {
			System.out.println("array is not sorted in increasing order");
		}
	}
}
