/*Problem: Reverse an array
  time complexity: O(n)
  space complexity:O(1)
  
  Example:10 5 7 30  
    output:30 7 5 10
    input:  3,5,10
    output:10 5 3
          
  Approach:   
*/

package array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void reverse(int[] Array, int length) {

		int high = length - 1, low = 0;
		while (high > low) {
			int temp;
			temp = Array[low];
			Array[low] = Array[high];
			Array[high] = temp;
			high--;
			low++;
		}

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

		reverse(Array, length);

		System.out.println("After swapping Array is ");

		for (int itr : Array) {
			System.out.print(itr + " ");
		}

	}
}
