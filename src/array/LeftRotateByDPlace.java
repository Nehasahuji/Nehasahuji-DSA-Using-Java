package array;

import java.util.Scanner;

public class LeftRotateByDPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		System.out.println("enter d");
		int d = sc.nextInt();

		LeftRotateToDPlace(Array, length, d);

		System.out.println("After rotating array to d  place ");

		for (int itr : Array) {
			System.out.print(itr + " ");
		}

	}

	private static void LeftRotateToDPlace(int[] array, int length, int d) {

		ReverseAnArray(array, 0, d - 1);
		ReverseAnArray(array, d, length - 1);
		ReverseAnArray(array, 0, length - 1);

	}

	private static void ReverseAnArray(int[] Array, int startIndex, int endindex) {

		while (startIndex < endindex) {
			int temp;
			temp = Array[startIndex];
			Array[startIndex] = Array[endindex];
			Array[endindex] = temp;
			endindex--;
			startIndex++;
		}

	}

}
