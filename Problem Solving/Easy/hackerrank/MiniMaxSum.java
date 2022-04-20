package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			list.add(i, sc.nextInt());
		}

		miniMaxSum(list);

	}

	public static void miniMaxSum(List<Integer> list) {
		int max = list.get(0), min = list.get(0);
		long res = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}

			if (list.get(i) < min) {
				min = list.get(i);
			}

			res += list.get(i);
		}

		System.out.println((res - max) + " " + (res - min));
	}

}
