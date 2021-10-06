/*Problem: search second Largest element in  an array
  time complexity: O(n)
  space complexity:O(1)
  Approach: navigate through each element and  check if element is 
  
 1. if element is greater than largest then check for the second largest if current largest value is greater than second largest 
    assign the second largest value to the second largest 
 2 .update the largest value if value is smaller then largest then check if the value is greater than second largest then assign it
 3 :if largest and second largest are equal then return -1
*/

package array.operation.search;

import java.util.Scanner;

public class SearchElementInArray {

	public static int searchElementInArray(int[] arr, int length, int elementToFind) {

		for (int itr = 0; itr < length; itr++) {
			if (arr[itr] == elementToFind) {
				return itr;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter length of array");

		int length = sc.nextInt();
		int[] Array = new int[length];

		System.out.println("insert element in array");

		for (int itr = 0; itr < length; itr++) {
			Array[itr] = sc.nextInt();
		}

		/*
		 * for (int itr = 0; itr < length; itr++) { System.out.print(Array[itr] + " ");
		 * }
		 */

		System.out.println();

		System.out.println("enter element want to search in array");
		int elementToFind = sc.nextInt();

//		System.out.println("element to search  in array is: " + elementToFind);

		int index = searchElementInArray(Array, length, elementToFind);
		if (index == -1) {
			System.out.println("element not found in array");
		} else {
			System.out.println("element found in array at index: " + index);
		}

	}

}
