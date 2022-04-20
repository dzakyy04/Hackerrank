package hackerrank;

import java.util.Scanner;

public class TimeConversion {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();

		System.out.println(timeConversion(s));
	}

	public static String timeConversion(String s) {
		String format = s.substring(s.length() - 2, s.length());
		int hour = Integer.parseInt(s.substring(0, 2));
		String print = null;
		if (format.equalsIgnoreCase("AM")) {
			print = hour == 12 ? "00" + s.substring(2, 8) : s.substring(0, 8);
		} else if (format.equalsIgnoreCase("PM")) {
			print = hour == 12 ? s.substring(0, 8) : (hour + 12) + s.substring(2, 8);
		}
		return print;
	}
}
