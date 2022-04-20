package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class AVeryBigSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		ArrayList<Long> list = new ArrayList<Long>();

		for (int i = 0; i < n; i++) {
			list.add(i, sc.nextLong());
		}

		System.out.println(aVeryBigSum(list));
	}

	public static long aVeryBigSum(ArrayList<Long> list) {
		long hasil = 0;
		for (int i = 0; i < list.size(); i++) {
			hasil += list.get(i);
		}

		return hasil;
	}

}
