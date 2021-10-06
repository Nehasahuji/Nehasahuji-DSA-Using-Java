
/*Problem: delete an element in  an array
  time complexity: O(n)
  space complexity:O(1)
  Approch: shift all the from one position at whcih you want to insert in array and insert element at that position
   */

package array.operation.deletion;

import java.util.Scanner;

public class deleteElementFromArray {

	public static int SearchElemetFromArray(int[] Arr, int length, int elementToSearch) {
		for (int itr = 0; itr < length; itr++) {
			if (Arr[itr] == elementToSearch) {
				return itr;
			}
		}
		return -1;
	}

	public static void deleteElementFromArray(int[] Arr, int length, int elementToDelete) {

		if (SearchElemetFromArray(Arr, length, elementToDelete) == -1) {
			System.out.print("element  not found in array");
		} else {
			for (int jtr = SearchElemetFromArray(Arr, length, elementToDelete); jtr < length - 1; jtr++) {
				{
					Arr[jtr] = Arr[jtr + 1];

				}
			}

			System.out.println("after deletion array is");

			for (int i = 0; i < length - 1; i++) {
				System.out.print(Arr[i]);
			}

		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array");
		int length = sc.nextInt();
		int[] Array = new int[length];

		System.out.println("enter array");

		for (int itr = 0; itr < length; itr++) {
			Array[itr] = sc.nextInt();
		}

		for (int itr = 0; itr < length; itr++) {
			System.out.print(Array[itr] + " ");
		}

		System.out.println();

		System.out.println("enter element to dlete from array");
		int elementToDelete = sc.nextInt();
		deleteElementFromArray(Array, length, elementToDelete);

	}

}
