package hackerrank;

import java.util.*;

public class AppleAndOrange {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int s = sc.nextInt(), t = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt();
		List<Integer> apples = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			apples.add(i, sc.nextInt());
		}
		List<Integer> oranges = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			oranges.add(i, sc.nextInt());
		}

		countApplesAndOranges(s, t, a, b, apples, oranges);
	}

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int ap = 0, or = 0;
		for (int i = 0; i < apples.size(); i++) {
			apples.set(i, (apples.get(i) + a));
			if (apples.get(i) >= s && apples.get(i) <= t) {
				ap++;
			}
		}

		for (int i = 0; i < oranges.size(); i++) {
			oranges.set(i, (oranges.get(i) + b));
			if (oranges.get(i) >= s && oranges.get(i) <= t) {
				or++;
			}
		}

		System.out.println(ap + "\n" + or);

	}
}
