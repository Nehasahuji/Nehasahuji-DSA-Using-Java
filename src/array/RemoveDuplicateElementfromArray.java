/*Problem: Remove duplicate Element and calculate the size of array
  time complexity: O(n)
  space complexity:O(1)
  
  Example:10 20 20 20 30 30 30 30 30 
    output:3
    input:  10 10 10
    output:1
          
  Approach:   
*/

package array;

import java.util.Scanner;

public class RemoveDuplicateElementfromArray {

	public static int RemoveDuplicate(int[] Array, int length) {

		int[] temp = new int[length];
		int size = 1;
		temp[0] = Array[0];
		for (int i = 0; i < length - 1; i++) {
			if (Array[i] != Array[i + 1]) {
				temp[size] = Array[i + 1];
				size++;

			}

		}

		for (int i = 0; i < size; i++) {
			System.out.print(temp[i] + " ");
		}

		System.out.println();
		return size;

	}

	public static int RemoveDuplicateEfficient(int[] Array, int length) {

		int[] temp = new int[length];
		int size = 1;

		for (int i = 0; i < length - 1; i++) {
			if (Array[i] != Array[i + 1]) {
				Array[size] = Array[i + 1];
				size++;
			}
		}

		return size;

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

		int size = RemoveDuplicateEfficient(Array, length);

		System.out.println("size of array after removing duplicate element are: " + size);

		System.out.println("elemets in array after removing duplicate elements");

		for (int itr = 0; itr < size; itr++) {
			System.out.print(Array[itr] + " ");
		}

	}

}
