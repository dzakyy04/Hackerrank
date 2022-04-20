package hackerrank;

import java.util.*;

public class BillDivision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> bill = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			bill.add(i, sc.nextInt());
		}
		int b = sc.nextInt();
		sc.close();
		bonAppetit(bill, k, b);
	}

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		int sum = 0;
		for (int i = 0; i < bill.size(); i++) {
			if(i == k) {
				continue;
			}
			sum += bill.get(i);
		}
		
		sum /= 2;

		if (sum == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - sum);
		}
	}

}
