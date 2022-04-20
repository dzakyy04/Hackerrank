package hackerrank;

import java.util.Scanner;

public class CatAndMouse {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int q = sc.nextInt();

		int cases[] = new int[q * 3];
		for (int i = 0; i < cases.length; i++) {
			cases[i] = sc.nextInt();
		}

		int x = 0, y = 0, z = 0;
		for (int i = 0; i < cases.length; i++) {
			if (i % 3 == 0) {
				x = cases[i];
			} else if (i % 3 == 1) {
				y = cases[i];
			} else {
				z = cases[i];
			}

			if (i % 3 == 2) {
				System.out.println(catAndMouse(x, y, z));
			}
		}
	}

	public static String catAndMouse(int x, int y, int z) {
		if (Math.abs(x - z) < Math.abs(y - z)) {
			return "Cat A";
		} else if (Math.abs(x - z) > Math.abs(y - z)) {
			return "Cat B";
		} else {
			return "Mouse C";
		}
	}
}
