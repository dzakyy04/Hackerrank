package hackerrank;

import java.util.Scanner;

public class CompareTheTriplets {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = new int[3];
		int b[] = new int[3];

		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			b[i] = sc.nextInt();
		}

		int res[] = compareTriplets(a, b);
		System.out.println(res[0] + " " + res[1]);
	}

	public static int[] compareTriplets(int[] a, int[] b) {
		int res[] = new int[2];
		for (int i = 0; i < 3; i++) {
			if (a[i] > b[i]) {
				res[0]++;
			} else if (a[i] < b[i]) {
				res[1]++;
			}
		}

		return res;
	}
}
