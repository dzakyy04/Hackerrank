package hackerrank;

import java.util.*;

public class BirthdayCakeCandles {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		List<Integer> candles = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			candles.add(i, sc.nextInt());
		}

		System.out.println(birthdayCakeCandles(candles));
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		int max = 0, count = 0;
		for (int i = 0; i < candles.size(); i++) {
			if (max < candles.get(i)) {
				max = candles.get(i);
				count = 1;
			} else if (candles.get(i) == max) {
				count++;
			}
		}

		return count;
	}
}
