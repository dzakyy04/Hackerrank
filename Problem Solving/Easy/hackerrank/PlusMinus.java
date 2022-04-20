package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(i, sc.nextInt());
		}

		plusMinus(list);
	}

	public static void plusMinus(List<Integer> list) {
		double pos = 0, neg = 0, zero = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 0) {
				pos++;
			} else if (list.get(i) < 0) {
				neg++;
			} else {
				zero++;
			}
		}

		System.out.printf("%.6f\n", pos / list.size());
		System.out.printf("%.6f\n", neg / list.size());
		System.out.printf("%.6f\n", zero / list.size());
	}

}
