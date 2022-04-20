package hackerrank;

import java.util.*;

public class SubArrayDivision {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(birthday(arr, d, m));
	}

	public static int birthday(int arr[], int d, int m) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int limit = i + m;
			if (limit > arr.length) {
				break;
			}

			int sum = 0;
			for (int j = i; j < limit; j++) {
				sum += arr[j];
			}

			if (sum == d) {
				result++;
			}
		}
		
		return result;

	}

}
