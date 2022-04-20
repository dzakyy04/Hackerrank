package hackerrank;

import java.util.Scanner;

public class AngryProfessor {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			System.out.println(angryProfessor(k, arr));
		}
	}

	public static String angryProfessor(int k, int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				count++;
			}
		}

		return ((count < k) ? "YES" : "NO");
	}

}
