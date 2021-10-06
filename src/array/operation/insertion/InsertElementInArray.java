package array.operation.insertion;

/*Problem: insert an element in  an array
  time complexity: O(n)
  space complexity:O(1)
  Approch: shift all the from one position at whcih you want to insert in array and insert element at that position
   */

import java.util.Scanner;

public class InsertElementInArray {

	public static void insertElementInArray(int arr[], int length, int position, int element) {

		for (int itr = length - 1; itr > position; itr++) {
			arr[itr] = arr[itr - 1];
		}
		arr[position - 1] = element;

		for (int itr = 0; itr < length; itr++) {
			System.out.print(arr[itr] + " ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter length of array");

		int length = sc.nextInt();
		int[] Array = new int[length];

		System.out.println("insert element in array");

		for (int itr = 0; itr < length - 1; itr++) {
			Array[itr] = sc.nextInt();
		}

		for (int itr = 0; itr < length; itr++) {
			System.out.print(Array[itr] + " ");
		}

		System.out.println();

		System.out.println("enter position at which you want to insert");
		int pos = sc.nextInt();
		System.out.println("enter the value which you want to insert");
		int value = sc.nextInt();

		insertElementInArray(Array, length, pos, value);

	}

}
