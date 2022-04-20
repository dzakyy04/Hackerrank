package hackerrank;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int height[] = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(hurdleRace(k, height));

	}

	public static int hurdleRace(int k, int height[]) {
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			if (max < height[i]) {
				max = height[i];
			}
		}
		if (max > k) {
			return max - k;
		} else {
			return 0;
		}
	}

}
