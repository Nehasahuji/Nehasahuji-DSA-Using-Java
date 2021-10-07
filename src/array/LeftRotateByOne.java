/*Problem:Left Rotate by one
  time complexity: O(n)
  space complexity:O(1)
  
  Example:1 2 3 4 5
    output:2 3 4 5 1
    input: 10 12 15
    output:12 15 10
    
          
  Approach:   
*/

package array;

import java.util.Scanner;

public class LeftRotateByOne {

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

		System.out.println();

		LeftRotateToOnePlace(Array, length);

		System.out.println("After rotating array to one place ");

		for (int itr : Array) {
			System.out.print(itr + " ");
		}

	}

	private static void LeftRotateToOnePlace(int[] array, int length) {

		int temp = array[0];
		for (int i = 1; i < length; i++) {
			array[i - 1] = array[i];
		}
		array[length - 1] = temp;

	}

}
