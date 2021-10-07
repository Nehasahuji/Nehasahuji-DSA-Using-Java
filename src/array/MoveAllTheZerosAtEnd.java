/*Problem: Move all the zero to end
  time complexity: O(n)
  space complexity:O(1)
  
  Example:8 5 0 10 20 
    output:8 5 10 20 0
    input: 0 0 0 10
    output:10 0 0 0
    input: 0 0 0 0
    output: 0 0 0 0
    input:10 20
    output:10 20
          
  Approach:   
*/

package array;

import java.util.Scanner;

public class MoveAllTheZerosAtEnd {

	public static void MoveAllZeroToEnd(int[] Array, int length) {

		for (int i = 0; i < length - 1; i++) {

			if (Array[i] == 0) {
				for (int j = i + 1; j < length; j++) {
					if (Array[j] != 0) {
						int temp;
						temp = Array[i];
						Array[i] = Array[j];
						Array[j] = temp;

						System.out.println(Array[j]);
					}
				}
			}
		}

	}

	public static void MoveAllZeroToEndEfficient(int[] Array, int length) {

		int count = 0;
		for (int i = 0; i < length; i++) {

			if (Array[i] != 0) {
				int temp;
				temp = Array[i];
				Array[i] = Array[count];
				Array[count] = temp;
				count++;
			}
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

		MoveAllZeroToEndEfficient(Array, length);

		System.out.println("After shiftting zero to end array is ");

		for (int itr : Array) {
			System.out.print(itr + " ");
		}

	}

}
