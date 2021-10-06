/*Problem: find Largest element in  an array
  time complexity: O(n)
  space complexity:O(1)
  Approch: navigate through each element and  check if element is present in array if present than return index of that array
*/

package array;

import java.util.Scanner;

public class LargestElementInArray {

	public static int LargestElementInArray(int[] Array, int length) {
		int maxElement = -32678;

		for (int itr = 0; itr < length; itr++) {
			if (Array[itr] > maxElement) {
				maxElement = Array[itr];
			}
		}

		return maxElement;
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

		System.out.println("Max element in array is " + LargestElementInArray(Array, length));

	}

}
