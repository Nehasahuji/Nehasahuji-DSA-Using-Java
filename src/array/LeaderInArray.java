/*Find Leaders in an array
Example
      length:7
      Input:7 10 4 8 6 5 2
      Output:10,6,6,5,2
      Input:10 20 30
      Output:30
      Input:30 20 10
      Output: 30 20 10
      Input: 7 10 4  6 5 2
      Output:10 6 5 2

For Naive solution: 
time complexityO(n^2)
space complexityO(1)

For Efficient solution:
time complexity:O(n)
space complexity:O(1)
*/

package array;

import java.util.Scanner;

public class LeaderInArray {

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

		LeadersInAnArray(Array, length);

	}

	private static void LeadersInAnArray(int[] array, int length) {

		for (int itr = 0; itr < length; itr++) {

			boolean flag = true;
			for (int jtr = itr + 1; jtr < length; jtr++) {

				if (array[itr] <= array[jtr]) {
					flag = false;

				}
			}

			if (flag == true) {
				System.out.print(array[itr]);
			}
		}
	}

	private static void LeadersInAnArrayEfficient(int[] array, int length) {

		int current_element = array[length];

		for (int itr = length - 1; itr > 0; itr--) {

			if (array[itr] > current_element) {

				current_element = array[itr];
				System.out.println(array[itr]);

			}

		}
	}
}
