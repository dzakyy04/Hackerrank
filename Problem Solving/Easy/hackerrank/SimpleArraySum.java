package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArraySum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = sc.nextInt();

		System.out.println(simpleArraySum(list, a));
	}

	static int simpleArraySum(ArrayList<Integer> list, int a) {
		int res = 0;
		for (int i = 0; i < a; i++) {
			list.add(i, sc.nextInt());
			res += (int) list.get(i);
		}
		return res;
	}
}
