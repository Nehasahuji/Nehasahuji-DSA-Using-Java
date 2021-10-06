package array;

import java.util.Scanner;

public class SecondLargestElement {

	public static int SecondLargestElementInArray(int[] Array, int length) {

		int maxElement = -32658, secondMaxElement = -32658;

		for (int itr = 0; itr < length; itr++) {
			if (Array[itr] >= maxElement) {
				if (maxElement > secondMaxElement) {
					secondMaxElement = maxElement;
				}
				maxElement = Array[itr];
			} else {
				if (secondMaxElement > Array[itr]) {
					secondMaxElement = Array[itr];
				}

			}
		}

		for (int itr = 0; itr < length; itr++) {
			if (Array[itr] < maxElement && Array[itr] > secondMaxElement) {
				secondMaxElement = Array[itr];
			}
		}

		if (maxElement == secondMaxElement) {
			return -1;
		}

		return secondMaxElement;

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

		System.out.println("Second Max element in array is " + SecondLargestElementInArray(Array, length));

	}

}
